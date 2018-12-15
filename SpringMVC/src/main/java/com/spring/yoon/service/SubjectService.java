package com.spring.yoon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.yoon.dao.SubjectDAO;
import com.spring.yoon.model.Subject;



@Service
public class SubjectService {

	@Autowired
	private SubjectDAO subjectDAO;
	public List<Subject> getCurrent() {
		return subjectDAO.getSubjects();
		
	}
	public void insert(Subject subject) {
		subjectDAO.insert(subject);
		}

}
