package com.vishalshirke.Project1BackEnd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vishalshirke.Project1BackEnd.model.Category;
import com.vishalshirke.Project1BackEnd.model.Customer;

@Repository("customerDAO")
public class CustomerDAO {
	
	SessionFactory sessionFactory;
	
	
	public CustomerDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void InertCustomer(Customer customer)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		
	}
	
	public List<Customer> retrieve()
	{
		Session session=sessionFactory.openSession();
		
		List<Customer> list=session.createQuery("from CustomerDetails").list();
		session.close();
		return list;
	}
	
	
	@Transactional 
	public void deleteCustomer(int cuid)
	{
		Session session=sessionFactory.getCurrentSession();
		Customer customer=(Customer)session.get(Customer.class,cuid);
		session.delete(customer);
	}
	
	
	@Transactional
	public Customer getCustomer(int cuid)
	{
		Session session=sessionFactory.openSession();
		Customer customer=(Customer)session.get(Customer.class,cuid);
		return customer;
	}
	
	@Transactional
	public void updateCustomer(Customer customer)
	{
		Session session=sessionFactory.getCurrentSession();
		session.update(customer);
	}

}
