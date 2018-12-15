package com.spring.yoon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.yoon.model.Subject;


@Repository
public class SubjectDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public int getRowCount() {
		String sqlStatement ="select count(*) from subjects";
		
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
		
	}
	public Subject getSubject(String name) {
		String sqlStatemet ="select * from subjects where name=?";
		
		return jdbcTemplate.queryForObject(sqlStatemet,new Object[] {name},
				new RowMapper<Subject>(){

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setCode(rs.getString("code"));
				subject.setName(rs.getString("name"));
				subject.setSeparation(rs.getString("separation"));
				subject.setCredit(rs.getInt("credit"));
				
				return subject;
				
			}		
		}
		);
	
	
	}
	public List<Subject> getSubjects() {
		String sqlStatemet ="select * from subjects";
		
		return jdbcTemplate.query(sqlStatemet,
				new RowMapper<Subject>(){

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setCode(rs.getString("code"));
				subject.setName(rs.getString("name"));
				subject.setSeparation(rs.getString("separation"));
				subject.setCredit(rs.getInt("credit"));
				
				return subject;
				
			}		
		}
		);
	
	
	}
	public boolean insert(Subject subject) {
		int year = subject.getYear();
		int semester = subject.getSemester();
		String code = subject.getCode();
		String name = subject.getName();
		String separation = subject.getSeparation();
		int credit = subject.getCredit();
		
		String sqlStatement = "insert into subjects (year,semester,code,name,separation,credit) values(?,?,?,?,?,?)";
		return (jdbcTemplate.update(sqlStatement,new Object[] {year,semester,code,name,separation,credit})==1);
	}
	public boolean delete(String name) {
		String sqlStatement = "delete from subjects where name=?";
		return (jdbcTemplate.update(sqlStatement,new Object[] {name})==1);
	}
}
