package com.firebasechatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.firebasechatapp.firebaseLogic.FirebaseChatEngine;
import com.firebasechatapp.model.User;

@Controller
public class ViewContoller {

	@Autowired
	FirebaseChatEngine chatEngine;
	
	
	@RequestMapping("/index")
	public ModelAndView welcome(){
		User user = new User();
		return new ModelAndView("index","new_user",user);
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("new_user")User user,BindingResult result){
		System.out.println(user.getNickname());
		chatEngine.registerUser(user);
		return "index";
	}
	
}
