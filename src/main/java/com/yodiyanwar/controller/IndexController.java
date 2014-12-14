package com.yodiyanwar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class IndexController{
	
	@RequestMapping
    public String getIndexPage() {
     
        return "index";
    }
}