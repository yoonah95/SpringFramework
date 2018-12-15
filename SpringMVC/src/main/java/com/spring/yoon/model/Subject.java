package com.spring.yoon.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Subject {

	public Subject() {
		super();
	}
	
	//@NotEmpty(message="The name cannot be empty")
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Subject [name=" + name
				+ "]";
	}
	
}
