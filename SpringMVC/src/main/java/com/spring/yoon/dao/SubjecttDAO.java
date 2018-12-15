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
import com.spring.yoon.model.Subjectt;


@Repository
public class SubjecttDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired 
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public int getCredit(int year,int semester) {
		String sqlStatement ="select sum(credit) from subjectts where year=? and semester=?";
		
		return jdbcTemplate.queryForObject(sqlStatement,new Object[] {year,semester}, Integer.class);
		
	}

	public List<Subjectt> getSubjectts(int year,int semester) {
		String sqlStatemet ="select * from subjectts where year=? and semester=?";
		
		return jdbcTemplate.query(sqlStatemet,new Object[] {year,semester},
				new RowMapper<Subjectt>(){

			public Subjectt mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Subjectt subjectt = new Subjectt();
				subjectt.setYear(rs.getInt("year"));
				subjectt.setSemester(rs.getInt("semester"));
				subjectt.setCode(rs.getString("code"));
				subjectt.setName(rs.getString("name"));
				subjectt.setSeparation(rs.getString("separation"));
				subjectt.setCredit(rs.getInt("credit"));
				
				return subjectt;
				
			}		
		}
		);
	
	
	}

}
