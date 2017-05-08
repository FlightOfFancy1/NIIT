package com.vishalshirke.Project1BackEnd.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishalshirke.Project1BackEnd.dao.CategoryDAO;
import com.vishalshirke.Project1BackEnd.model.Category;

public class CategoryTest {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private static Category category;
	
	@BeforeClass
	public static void init()
	{
	 context=new AnnotationConfigApplicationContext();
	context.scan("com.vishalshirke.Project1BackEnd");
	context.refresh();
	}
	
	@Test
	public void addcategory()
	{
//	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
//	
//	category=new Category();
//	category.setCatname("xyz");
//	categoryDAO.InsertCategory(category);
//	
//	
//	 category=new Category();
//	category.setCatname("pqr"); 
//	
//	categoryDAO.InsertCategory(category);
//	
//	System.out.println("Category addded");
//	
	
	}
//	@Test
//	public void updatecategory()
//	{
//		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
//		category=new Category();
//		
//		categoryDAO.getCategory(3);
//		category.setCatname("lmn");
//		categoryDAO.updateCategory(category);
//		System.out.println("Category Updated");
//	}
//	
	@Test
	public void deletecategory()
	{
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		category=new Category();
	
		
		
	}
	
	
//	List<Category> list=categoryDAO.retrieve();
//	
//	for(Category c:list)
//	{
//		System.out.println(""+c.getCatid());
//	}
//	
	
	
}

