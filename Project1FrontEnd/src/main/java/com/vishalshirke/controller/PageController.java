package com.vishalshirke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController
{
    @RequestMapping(value={"/","/home"})
	public ModelAndView index()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Home");
	   mv.addObject("userCilckHome",true);
		return mv;
   }
    

    @RequestMapping(value="/sell")
	public ModelAndView sell()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Home");
	   mv.addObject("userCilckSell",true);
		return mv;
   }
    
    @RequestMapping(value="/categories")
	public ModelAndView Categories()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Home");
	   mv.addObject("userCilckCategories",true);
		return mv;
   }
    
    @RequestMapping(value="/food")
	public ModelAndView Food()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Home");
	   mv.addObject("userCilckFood",true);
		return mv;
   }
    
    @RequestMapping(value="/accessories")
	public ModelAndView Accessories()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Home");
	   mv.addObject("userCilckAccessories",true);
		return mv;
   }
   

	@RequestMapping(value = "/aboutus")
	public ModelAndView AboutUs() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userCilckAboutUs", true);
		return mv;
	}
	
	@RequestMapping(value="/wishlist")
	public ModelAndView Wishlist()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Home");
	   mv.addObject("userCilckwishlist",true);
		return mv;
   }
}