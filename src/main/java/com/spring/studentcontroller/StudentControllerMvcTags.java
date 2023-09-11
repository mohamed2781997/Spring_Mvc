package com.spring.studentcontroller;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Student;

//http://localhost:8080/Spring-Mvc/student-mvc-tags
@Controller
@RequestMapping("/student-mvc-tags") 
public class StudentControllerMvcTags {
	
	
	//http://localhost:8080/Spring-Mvc/student-mvc-tags//account-Mvc-tafz

	@RequestMapping("/account-Mvc-tafz")
public String StudentFormMvcTags(Model m) {
		   Student student=new Student();
		   m.addAttribute("stud", student);
		
	return "student-front-mvc-tags/studentaccount";
	
}
	@RequestMapping("/processmvctags")
	public String showinfo(@Valid@ModelAttribute("stud")Student student,BindingResult bindingResult) //عشان يجيب الموديل  اللى اتعمل 
	
	{
		if(bindingResult.hasErrors()) {
			//@valid refers to probably find error
			//check if has error 
		return "student-front-mvc-tags/studentaccount"; 	
		}
		
		else {
			
			return "student-front-mvc-tags/showdatastudent";

		}

		
		
			
		}
	//for solve spaces problem
			@InitBinder
			public void initbinder(WebDataBinder binder) {
				StringTrimmerEditor editor=new StringTrimmerEditor(true);
				binder.registerCustomEditor(String.class,editor);
				
	}
	
	
	
}
