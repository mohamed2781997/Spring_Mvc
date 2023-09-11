package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//http://localhost:8080/Spring-Mvc     default
@Controller
@RequestMapping("/processes")  // 	//http://localhost:8080/Spring-Mvc/processes/ 

public class ProcessData {
	//http://localhost:8080/Spring-Mvc/processes/signin
			@RequestMapping("/signin")
			public String mylogin() {
				return "login";
			}

}
