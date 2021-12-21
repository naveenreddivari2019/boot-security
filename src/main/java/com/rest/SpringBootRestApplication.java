package com.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.dao.CourseReviewDAOImpl;
import com.rest.dao.StudentDAOImpl;
import com.rest.models.Student;

@SpringBootApplication

public class SpringBootRestApplication implements CommandLineRunner{

	@Autowired
	StudentDAOImpl dao;
	
	@Autowired
	CourseReviewDAOImpl crdao;
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(SpringBootRestApplication.class, args);

		/*
		 * ConfigurableApplicationContext appContext =
		 * SpringApplication.run(SpringBootRestApplication.class, args); for (String
		 * name : appContext.getBeanDefinitionNames()) { System.out.println(name); }
		 */
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//dao.insertStudent(new Student("Naveen", 40));
		//dao.insertStudent(new Student("Reddy", 31));
		log.info("Test DAO : "+dao.getStudent(4));
		//dao.deleteStudent(4);
		
		crdao.courseReviewInsert();
		
		crdao.fetchCourseReview();
		
		
	}

}
