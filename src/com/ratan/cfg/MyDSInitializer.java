package com.ratan.cfg;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyDSInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		
		
		AnnotationConfigWebApplicationContext ac=new AnnotationConfigWebApplicationContext();

		ac.register(AppConfig.class);
		
		DispatcherServlet ds=new DispatcherServlet(ac);

	ServletRegistration.Dynamic register=ctx.addServlet("myds", ds);
		
	register.setLoadOnStartup(1);
	register.addMapping("/");
		
		
		
	}

}
