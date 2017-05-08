package com.vishalshirke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vishalshirke.Project1BackEnd.dao.CategoryDAO;

@Controller
public class CategoryController {

	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping(value="/categorymanagement")
	public ModelAndView showCategorymanagement()
	{
		ModelAndView mv=new ModelAndView("CategoryManagement"); 
		return mv;
	}
	
}
