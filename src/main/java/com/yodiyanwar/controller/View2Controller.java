package com.yodiyanwar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/view2")
public class View2Controller{

	@RequestMapping
	public String getView2(){
		return "view2";
	}

}