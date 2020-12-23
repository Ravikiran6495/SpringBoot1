package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.utlity.Student;

@Controller
public class AppController {

	@RequestMapping("abc")
	public String Hadler() {

		return "first.jsp";
	}

	
	@RequestMapping("process")
	public String Hanlde(@ModelAttribute Student student ) {
		
		return "welcome.jsp";
	}

}
