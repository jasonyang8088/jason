package com.jason.demo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping
	public String home(Map<String, Object> model){
		model.put("date", new Date());
		return "home";
	}
}
