package com.vishalshirke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vishalshirke.Project1BackEnd.dao.CategoryDAO;
import com.vishalshirke.Project1BackEnd.dao.SigninDAO;


@Controller
public class PageController
{
	@Autowired
	CategoryDAO categoryDAO;
	
    @RequestMapping(value={"/","/home"})
	public ModelAndView index()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Home");
	   mv.addObject("categories",categoryDAO.retrieve());
	   mv.addObject("userCilckHome",true);
		return mv;
   }
    

    @RequestMapping(value="/sell")
	public ModelAndView sell()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Sell Your pet");
	   mv.addObject("userCilckSell",true);
		return mv;
   }
    
    @RequestMapping(value="/categories")
	public ModelAndView Categories()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Categories");
	   mv.addObject("userCilckCategories",true);
		return mv;
   }
    
    @RequestMapping(value="/food")
	public ModelAndView Food()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Pet Food");
	   mv.addObject("userCilckFood",true);
		return mv;
   }
    
    @RequestMapping(value="/accessories")
	public ModelAndView Accessories()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Accessories");
	   mv.addObject("userCilckAccessories",true);
		return mv;
   }
   

	@RequestMapping(value = "/aboutus")
	public ModelAndView AboutUs() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userCilckAboutUs", true);
		return mv;
	}
	
	@RequestMapping(value="/wishlist")
	public ModelAndView Wishlist()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Wishlist");
	   mv.addObject("userCilckWishlist",true);
		return mv;
   }
	

	@RequestMapping(value="/contactus")
	public ModelAndView ContactUs()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Contact Us");
	   mv.addObject("userCilckContactUs",true);
		return mv;
   }
	@Autowired
	SigninDAO signinDAO;
	
	
	
	@RequestMapping(value="/login")
	public ModelAndView Login()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","User-Login");
	   mv.addObject("userCilckLogin",true);
		return mv;
   }
}