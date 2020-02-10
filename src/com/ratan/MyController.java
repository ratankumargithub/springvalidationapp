package com.ratan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@ModelAttribute()
	public void funx(Model m){
		
		String clist[]={};
		m.addAttribute("student", new StudentBean(5, "amit", 750,clist,false,"",""));
	}
	
	@Autowired
	StudentValidator val;
	
	
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String homeRequest(Model model){
	
		//setting the initial value to the form
		String clist[]={};
		model.addAttribute("student", new StudentBean(100, "ram", 850,clist,false,"",""));
		
		return "home";
	}
	
	
	
	@RequestMapping(value="registerStudent")
	public ModelAndView registerStudent(@Valid @ModelAttribute("student") StudentBean s,BindingResult br){
	
		ModelAndView mv=new ModelAndView();
		
		val.validate(s, br);
		
		
		
		
		if(br.hasErrors()){
			
			System.out.println(br.getAllErrors());
			
			mv.setViewName("home");
			mv.addObject("student",s);
			return mv;
		}
		else{
		
		mv.setViewName("result");
		
		
		
		return mv;
		}
	}
	
}
	