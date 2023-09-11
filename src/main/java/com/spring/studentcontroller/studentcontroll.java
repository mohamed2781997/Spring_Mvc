package com.spring.studentcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;

//http://localhost:8080/Spring-Mvc/student  default
@Controller
@RequestMapping("/student")
public class studentcontroll {

	
	//http://localhost:8080/Spring-Mvc/student/account  لازم عشان يوصل للفنكشن اللى تحت دى لازم يدهل العنوان ده
	@RequestMapping("/account")
	public String studentform() {
	return "student-form/studentaccount";
	
}
	@RequestMapping("/studentprocess")
	public String getDataStudent(@RequestParam ("f_name") String firstname,@RequestParam("l_name")String lastname,
			@RequestParam("age")String age ,Model m)
	{
		Student student=new Student();
		student.setfName(firstname);
		student.setLname(lastname);
		student.setAge(age);
		m.addAttribute("myStudent",student);
		
		
		  
		return"student-form/showdatastudent";
		
	}
}
