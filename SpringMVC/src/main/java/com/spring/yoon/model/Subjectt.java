package com.spring.yoon.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Subjectt {

	public Subjectt() {
		super();
	}
	//@NotEmpty(message="The year cannot be empty")
	private int year;
	//@NotEmpty(message="The semester cannot be empty")
	private int semester;
	//@NotEmpty(message="The code cannot be empty")
	private String code;
	//@NotEmpty(message="The name cannot be empty")
	private String name;
	//@NotEmpty(message="The separation cannot be empty")
	private String separation;
	//@NotEmpty(message="The credit cannot be empty")
	private int credit;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeparation() {
		return separation;
	}
	public void setSeparation(String separation) {
		this.separation = separation;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Subject [year=" + year + ", semester=" + semester + ", code=" + code + ", name=" + name
				+ ", separation=" + separation + ", credit=" + credit + "]";
	}
	
}
