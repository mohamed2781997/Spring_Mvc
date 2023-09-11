package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//http://localhost:8080/Spring-Mvc
@Controller
//@RequestMapping("/spring")// دا معناه ان مل اللى تحت ده ال url ده بقا الديفولت
public class MainController {

	//http://localhost:8080/Spring-Mvc/Spring لو عاوزة يبدأ ب spring (default)

	
	
	//http://localhost:8080/Spring-Mvc/
	@RequestMapping("/")
	public String main() {
		return "mainpage";
	}

	//http://localhost:8080/Spring-Mvc/profile
	@RequestMapping("/profile") // لو كتبت ف اليو ار ال بعد باك اسلاش كلمة بروفيل يروح ينده الصفحه
	public String pro() {
		return "myprofile";
	}
	
	
	
		
		/*
		//http://localhost:8080/Spring-Mvc/login
				@RequestMapping("/Loginprocess")
				public String process(HttpServletRequest request,Model m) {
					String username= request.getParameter("user");
					String password= request.getParameter("pass");
					String newname="(username="+username.toUpperCase()+")";
					String newpass="(password="+password+")";
					m.addAttribute("myusername",newname);
					m.addAttribute("mypassword",newpass);
					return "process";
				}
				*/
		
		
				// new from spring delete http request
				@RequestMapping("/Loginprocess")
				public String process(@RequestParam("user")String username,@RequestParam("pass")String password,Model m) {
					String newname="(username="+username.toUpperCase()+")";
					String newpass="(password="+password+")";
					m.addAttribute("myusername",newname);
					m.addAttribute("mypassword",newpass);
					return "process";
				}
				
				
}
