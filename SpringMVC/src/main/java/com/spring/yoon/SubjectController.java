package com.spring.yoon;

import java.util.List;

import javax.validation.Valid;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.yoon.model.Subject;
import com.spring.yoon.service.SubjectService;


@Controller
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subjects")
	public String showSubjects(Model model) {
		List<Subject> subjects = subjectService.getCurrent();
		model.addAttribute("subjects",subjects);
		
		return "subjects"; 
	}
	
		@RequestMapping("/createsubject")
	public String createSubject(Model model) {
		
		model.addAttribute("subject", new Subject());
		return "createsubject"; 
	}
	
	@RequestMapping("/docreate")
	public String doCreat(Model model,@Valid Subject subject,BindingResult result) {

		
		if(result.hasErrors()) {
			System.out.println("====Form data dose not Vaildated");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createsubject";
		}
		
		subjectService.insert(subject);
		return "subjectcreated"; 
		
	}
	

}
