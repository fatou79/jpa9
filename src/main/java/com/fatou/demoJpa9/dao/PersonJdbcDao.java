package com.fatou.demoJpa9.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {
	
	
	@Autowired
	JdbcTemplate diagne;
	
	public List<Person> findAll(){
		return diagne.query("select * from person", 
				new BeanPropertyRowMapper(Person.class));
		
	}
	
	

}
