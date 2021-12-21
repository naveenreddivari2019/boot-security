package com.rest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.rest.SpringBootRestApplication;
import com.rest.dao.StudentDAOImpl;
import com.rest.models.Student;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootRestApplication.class)
public class StudentDAOImplTest {

	@Autowired
	StudentDAOImpl dao;

	@Test
	public void getStudent() {
		Student s=dao.getStudent(2);
		assertEquals("Naveen", s.getName());
	}
	
	@Test
	@DirtiesContext
	public void deleteStudent() {
		dao.deleteStudent(3);
		assertNull(dao.getStudent(3));
	}

}
