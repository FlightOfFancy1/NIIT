package com.vishalshirke.Project1BackEnd.config;



import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.vishalshirke.Project1BackEnd.dao.SigninDAO;
import com.vishalshirke.Project1BackEnd.model.Category;
import com.vishalshirke.Project1BackEnd.model.Signin;




@Configuration // we are creating some beans that will be managed by our spring
@ComponentScan("com.vishalshirke.Project1BackEnd")
@EnableTransactionManagement

public class ApplicationConfig {

	// Three beans will be created
	// 1. Datasource (providing the connection information of the database)
	// 2. SessionFactory (Configures application to use hibernate and create a
	// session object)
	// 3. HibernateTransactionManager (to manage hibernate transactions)

	// Method will provide the Database Specific Info
	// DataSource object will contain that
	public DataSource getH2DataSource() {
		System.out.println("Data Source Method");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/OnlinePetShopProj");
		dataSource.setUsername("vishal");
		dataSource.setPassword("vishal");
		System.out.println("Data Source Created");
		return dataSource;
	}

		@Autowired
    @Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory()
	{
		
		System.out.println("SessionFactory Method-Entered");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Signin.class);
		SessionFactory sessionfactory=sessionBuilder.buildSessionFactory();
		System.out.println("SessionFactory Object Created");
		return sessionfactory;
	
	}
	
	
		//Method will provide the Hibernate Related Properties
		//Properties object will contain the data.
	private Properties getHibernateProperties() {
		System.out.println("Hibernate Properties -Entered");
		Properties hibernate_prop=new Properties();
		hibernate_prop.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernate_prop.put("hibernate.show_sql", "true"); //optional
		hibernate_prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		System.out.println("Hibernate Prperty Object Created");
		return hibernate_prop;
	}


	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("Transaction Manager");
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
	@Bean(name="signinDAO")
	public SigninDAO getSigninDAO(SessionFactory sessionFactory)
	{
		return new SigninDAO(sessionFactory);
	}
	
	

}