package com.ratan.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.ratan")
public class AppConfig {

		@Bean
		public ViewResolver createViewResolver(){
		
		InternalResourceViewResolver irv=new InternalResourceViewResolver();
		
		irv.setPrefix("/WEB-INF/pages/");
		irv.setSuffix(".jsp");
		
		return irv;
	
	}	
}
