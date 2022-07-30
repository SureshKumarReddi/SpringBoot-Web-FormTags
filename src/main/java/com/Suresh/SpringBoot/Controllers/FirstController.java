package com.Suresh.SpringBoot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Suresh.SpringBoot.Models.Student;

@Controller
public class FirstController {


	@GetMapping("/loadform")
	public String loadForms(Model model) {
		
		Student studObj = new Student();
		model.addAttribute("student", studObj);
		return "index";
	}
	
	@GetMapping("/showform")
	public String goToSuccess(Student obj) {
		System.out.println(obj);
		return "success";
	}
}
