package com.firebasechatapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.firebasechatapp.firebaseLogic.FireBaseRefs;
import com.firebasechatapp.firebaseLogic.FirebaseChatEngine;
import com.firebasechatapp.listeners.UsersListeners;
import com.firebasechatapp.model.User;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.firebasechatapp"})
public class WebAppConfig extends WebMvcConfigurerAdapter{

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		super.configureDefaultServletHandling(configurer);
	}
	
	@Bean
	 public ViewResolver configureViewResolver() {
	     InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
	     viewResolve.setPrefix("/WEB-INF/views/");
	     viewResolve.setSuffix(".jsp");

	     return viewResolve;
	 }
	
	@Bean
	public FirebaseChatEngine chatEngine(){
		return new FirebaseChatEngine();
	}
	
	@Bean
	public UsersListeners usersListeners(){
		return new UsersListeners();
	}
	
	@Bean
	public FireBaseRefs fireBaseRefs(){
		FireBaseRefs fireBaseRefs = new FireBaseRefs();
		fireBaseRefs.setRootRef("https://capacitijavachatapp.firebaseio.com/");
		fireBaseRefs.setUsersRef("/users");
		fireBaseRefs.setMessageRef("/messages");
		fireBaseRefs.getUsersRef().addChildEventListener(usersListeners());
		return fireBaseRefs;
	}
	
	@Bean
	public User currentUser(){
		return new User();
	}
}
