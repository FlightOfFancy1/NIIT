package com.vishalshirke.Project1BackEnd.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishalshirke.Project1BackEnd.dao.CustomerDAO;
import com.vishalshirke.Project1BackEnd.model.Customer;

public class CustomerTest {

	private static AnnotationConfigApplicationContext context;
	private static CustomerDAO customerDAO;
	private static Customer customer;
	
	@BeforeClass
	public static void init()
	{
	 context=new AnnotationConfigApplicationContext();
	context.scan("com.vishalshirke.Project1BackEnd");
	context.refresh();
	
	}
	
	
	@Test
	public void addcustomer()
	{
	customerDAO=(CustomerDAO)context.getBean("customerDAO");
	customer=new Customer();
	customerDAO.InertCustomer(customer);
	
	}
	
	@Test
	public void updatecustomer()
	{
		customerDAO=(CustomerDAO)context.getBean("customerDAO");
		customer=new Customer();
		
//		customerDAO.getCustomer(1);
//		customerDAO.updateCustomer(customer);
//		System.out.println("customer Updated");
	}
	
	@Test
	public void deletecustomer()
	{
		customerDAO=(CustomerDAO)context.getBean("customerDAO");
		customer=new Customer();
		
	
	}
}
