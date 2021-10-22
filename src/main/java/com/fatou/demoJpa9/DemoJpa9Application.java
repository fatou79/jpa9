package com.fatou.demoJpa9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.demoJpa9.dao.PersonJdbcDao;

@SpringBootApplication
public class DemoJpa9Application implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao coumba;

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", coumba.findAll());
		
		// TODO Auto-generated method stub
		
	}

}
