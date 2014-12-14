package com.yodiyanwar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/view1")
public class View1Controller{

	@RequestMapping
	public String getView1(){
		return "view1";
	}

}