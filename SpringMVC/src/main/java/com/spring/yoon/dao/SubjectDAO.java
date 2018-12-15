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

	public Subject getSubject(String name) {
		String sqlStatemet ="select * from subjects where name=?";
		
		return jdbcTemplate.queryForObject(sqlStatemet,new Object[] {name},
				new RowMapper<Subject>(){

			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();
				
				subject.setName(rs.getString("name"));
				
				
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
				
				subject.setName(rs.getString("name"));
			
				return subject;
				
			}		
		}
		);
	
	
	}
	public boolean insert(Subject subject) {
	
		String name = subject.getName();
		
		String sqlStatement = "insert into subjects (name) values(?)";
		return (jdbcTemplate.update(sqlStatement,new Object[] {name})==1);
	}
	public boolean delete(String name) {
		String sqlStatement = "delete from subjects where name=?";
		return (jdbcTemplate.update(sqlStatement,new Object[] {name})==1);
	}
}
