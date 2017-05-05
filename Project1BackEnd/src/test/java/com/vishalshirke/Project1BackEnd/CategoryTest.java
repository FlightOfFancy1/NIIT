package com.vishalshirke.Project1BackEnd;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishalshirke.Project1BackEnd.dao.CategoryDAO;
import com.vishalshirke.Project1BackEnd.model.Category;

public class CategoryTest {

	public static void main(String args[])
	{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.vishalshirke.Project1BackEnd");
	context.refresh();
	
	CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	
	Category category=new Category();
	
	category.setCatid(1);
	category.setCatname("dogs");
	
	categoryDAO.InsertCategory(category);
	
	System.out.println("Category addded");
	
	List<Category> list=categoryDAO.retrieve();
	
	for(Category c:list)
	{
		System.out.println(""+c.getCatid());
	}
	
	
}

}