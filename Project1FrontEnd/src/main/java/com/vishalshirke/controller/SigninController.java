package com.vishalshirke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vishalshirke.Project1BackEnd.dao.SigninDAO;
import com.vishalshirke.Project1BackEnd.model.Signin;

@Controller

@RequestMapping("/manage")
public class SigninController {

	@Autowired
	SigninDAO signinDAO;
	
	@RequestMapping(value="/register")
	public ModelAndView Register()
   {
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("title","Register");
	   mv.addObject("userCilckRegister",true);
	   return mv;
   }
	
	@RequestMapping(value="CustomerAdd",method=RequestMethod.GET)
	public String addCustomer(@RequestParam ("cufname") String cufname,@RequestParam ("culname") String culname,@RequestParam ("cuemail") String cuemail,@RequestParam ("cumob")  int cumob,@RequestParam ("cuaddress") String cuaddress,@RequestParam ("cupassword") String cupassword)
	{
		Signin signin=new Signin();
		
		signin.setCufname(cufname);
		signin.setCulname(culname);
		signin.setCuemail(cuemail);
		signin.setCuaddress(cuaddress);
		signin.setCumob(cumob);
		signin.setCupassword(cupassword);
		signinDAO.InertCustomer(signin);
		return "redirect:/manage/register";	
	}
	
	
//			@RequestMapping(value="/yes",method=RequestMethod.GET)
//			public String abc()
//			{
//				return "redirect:/manage/yes";
//			}
//	
}
