package com.vishalshirke.Project1BackEnd.dao;

import java.util.List;
import com.vishalshirke.Project1BackEnd.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("categoryDAO")
public class CategoryDAO {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDAO(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
		public void InsertCategory(Category category)
		{
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(category);
		}
		
		@Transactional
		public List<Category> retrieve()
		{
			Session session=sessionFactory.openSession();
			
			List<Category> ls=session.createQuery("from Category").list();
			session.close();
			return ls;
		}
		@Transactional 
		public void deleteProduct(int catid)
		{
			Session session=sessionFactory.getCurrentSession();
			Category category=(Category)session.get(Category.class,catid);
			session.delete(category);
		}
		
		
		
		public Category getProduct(int catid)
		{
			Session session=sessionFactory.openSession();
			Category category=(Category)session.get(Category.class,catid);
			session.close();
			return category;
		}
		
		@Transactional
		public void updateProduct(Category category)
		{
			Session session=sessionFactory.getCurrentSession();
			session.update(category);
		}
}
