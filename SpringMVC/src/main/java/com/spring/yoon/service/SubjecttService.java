package com.spring.yoon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.yoon.dao.SubjecttDAO;
import com.spring.yoon.model.Subjectt;

@Service
public class SubjecttService {

	@Autowired
	private SubjecttDAO subjecttDAO;
	
	
	
	public List<Subjectt> getCurrent(int year,int semester) {
		return subjecttDAO.getSubjectts(year,semester);
		
	}
	public int getCredit(int year,int semester) {
		return subjecttDAO.getCredit(year,semester);
	}

}
