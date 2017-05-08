package com.vishalshirke.Project1BackEnd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vishalshirke.Project1BackEnd.model.Category;

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
		
		
		public List<Category> retrieve()
		{
			Session session=sessionFactory.openSession();
			
			List<Category> list=session.createQuery("from Category").list();
			session.close();
			return list;
		}
		
		
		@Transactional 
		public void deleteCategory(int catid)
		{
			Session session=sessionFactory.getCurrentSession();
			Category category=(Category)session.get(Category.class,catid);
			session.delete(category);
		}
		
		
		@Transactional
		public Category getCategory(int catid)
		{
			Session session=sessionFactory.openSession();
			Category category=(Category)session.get(Category.class,catid);
			return category;
		}
		
		@Transactional
		public void updateCategory(Category category)
		{
			Session session=sessionFactory.getCurrentSession();
			session.update(category);
		}
}
