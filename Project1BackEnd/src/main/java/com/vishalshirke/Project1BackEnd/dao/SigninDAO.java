package com.vishalshirke.Project1BackEnd.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vishalshirke.Project1BackEnd.model.Signin;

@Repository("signinDAO")
public class SigninDAO {
	
	SessionFactory sessionFactory;
	
	
	public SigninDAO(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void InertCustomer(Signin signin)
	{
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(signin);
		
	}

}
