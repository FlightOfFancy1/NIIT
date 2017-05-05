package com.vishalshirke.Project1BackEnd.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vishalshirke.Project1BackEnd.model.Customer;


@Repository("customerDAO") //the name is same as the object of CustomerDAO
public class CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public CustomerDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
//	The session object provides an interface between the application and data stored in the database.
//	It is a short-lived object and wraps the JDBC connection.
//	It is factory of Transaction, Query and Criteria. 
//	It holds a first-level cache (mandatory) of data. 
//	The org.hibernate.Session interface provides methods to insert, update and delete the object.
//	It also provides factory methods for Transaction, Query and Criteria.
		@Transactional
		public void InsertCustomer(Customer customer)
		{
			Session session=sessionFactory.getCurrentSession();
		    session.saveOrUpdate(customer);
		
		}
		
		@Transactional
		public List<Customer> retrieve()
		{
			Session session=sessionFactory.openSession();
			@SuppressWarnings("unchecked")
			List<Customer> list=session.createQuery("from Customer").list();
			session.close();
			return list;
		}
		
}
