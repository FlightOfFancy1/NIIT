package com.vishalshirke.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vishalshirke.Project1BackEnd.dao.CustomerDAO;
import com.vishalshirke.Project1BackEnd.model.Customer;

@Controller
@RequestMapping("/manage")
public class CustomerController {

	@Autowired
	CustomerDAO customerDAO;
	
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
		Customer customer=new Customer();
		
		customer.setCufname(cufname);
		customer.setCulname(culname);
		customer.setCuemail(cuemail);
		customer.setCuaddress(cuaddress);
		customer.setCumob(cumob);
		customer.setCupassword(cupassword);
		customer.setJoinedDate(new Date());
		customerDAO.InertCustomer(customer);
		return "redirect:/manage/register";	
	}
	
	
//			@RequestMapping(value="/yes",method=RequestMethod.GET)
//			public String abc()
//			{
//				return "redirect:/manage/yes";
//			}
//	
}
