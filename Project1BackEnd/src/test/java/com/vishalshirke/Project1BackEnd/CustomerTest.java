package com.vishalshirke.Project1BackEnd;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishalshirke.Project1BackEnd.dao.*;
import com.vishalshirke.Project1BackEnd.model.*;


public class CustomerTest {

	public static void main(String args[])
	{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.vishalshirke.Project1BackEnd");
	context.refresh();
	
	
	CustomerDAO customerDAO=(CustomerDAO)context.getBean("customerDAO");
	
	// Inserting customer details
	
	Customer customer=new Customer();//object of a POJO class is called as persistent object
	
	customer.setCustid(1);
	customer.setCustfnnm("vishal");
	customer.setCustlnm("shirke");
	customer.setCustemail("mockersage@hmail.com");
	customer.setCustmob(565656);
	
	customerDAO.InsertCustomer(customer);
	System.out.println("Customer added");
	
	List<Customer> list=customerDAO.retrieve();
	
	for(Customer cs :list)
	{
		System.out.println(""+cs.getCustid());
		System.out.println(""+cs.getCustlnm());
	}
	
	
}
	
}
