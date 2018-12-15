package com.spring.yoon;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.yoon.model.Subject;
import com.spring.yoon.model.Subjectt;
import com.spring.yoon.service.SubjectService;
import com.spring.yoon.service.SubjecttService;


@Controller
public class SubjecttController {

	@Autowired
	private SubjecttService subjecttService;
	
	@RequestMapping("/checkcredit")
	public String showSCredits(Model model) {
		int credit1 = subjecttService.getCredit(2015,1);
		int credit2 = subjecttService.getCredit(2015,2);
		int credit3 = subjecttService.getCredit(2016,1);
		int credit4 = subjecttService.getCredit(2016,2);
		int credit5 = subjecttService.getCredit(2018,1);
		int credit6 = subjecttService.getCredit(2018,2);
		
		model.addAttribute("credit1",credit1);
		model.addAttribute("credit2",credit2);
		model.addAttribute("credit3",credit3);
		model.addAttribute("credit4",credit4);
		model.addAttribute("credit5",credit5);
		model.addAttribute("credit6",credit6);
		
		return "checkcredit"; 
	}
	
	@RequestMapping(value="/checksubjects",method=RequestMethod.GET)
	public String showSubjects(@RequestParam(name="param")int param,Model model) {


		List<Subjectt> subjectts1 = subjecttService.getCurrent(2015,1);
		List<Subjectt> subjectts2 = subjecttService.getCurrent(2015,2);
		List<Subjectt> subjectts3 = subjecttService.getCurrent(2016,1);
		List<Subjectt> subjectts4 = subjecttService.getCurrent(2016,2);
		List<Subjectt> subjectts5 = subjecttService.getCurrent(2018,1);
		List<Subjectt> subjectts6 = subjecttService.getCurrent(2018,2);
		
		if(param==1)
		model.addAttribute("subjectts1",subjectts1);
		else if(param==2)
		model.addAttribute("subjectts1",subjectts2);
		else if(param==3)
		model.addAttribute("subjectts1",subjectts3);
		else if(param==4)
		model.addAttribute("subjectts1",subjectts4);
		else if(param==5)
		model.addAttribute("subjectts1",subjectts5);
		else if(param==6)
		model.addAttribute("subjectts1",subjectts6);

		
		return "checksubjects"; 
	}
	
	
		

}
