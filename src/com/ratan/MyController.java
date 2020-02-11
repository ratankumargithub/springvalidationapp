package com.ratan;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	
	
	@Autowired
	StudentValidator val;
	
	
	@InitBinder("student")
    public void customizeBinding (WebDataBinder binder) {
	
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		DateProperty dp=new DateProperty();
		binder.registerCustomEditor(Date.class, dp);
		//binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, true));
	}
	
	
	
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String homeRequest(Model model){
	
		model.addAttribute("student", new StudentBean());
		
		return "home";
	}
	
	
	
	@RequestMapping(value="registerStudent")
	public ModelAndView registerStudent(@Valid @ModelAttribute("student") StudentBean s,BindingResult br){
	
		ModelAndView mv=new ModelAndView();
		
		val.validate(s, br);
		
		if(br.hasErrors()){
			
			System.out.println(br.getAllErrors());
			
			mv.setViewName("home");
			
			return mv;
		}
		else{
		
		mv.setViewName("result");
		
		
		
		return mv;
		}
	}
	
}
	