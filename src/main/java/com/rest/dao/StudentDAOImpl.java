package com.rest.dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rest.models.Student;

@Repository
@Transactional
public class StudentDAOImpl {

	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	public Student getStudent(Integer i){
		log.info("get Student Object : "+i);
		return em.find(Student.class, i);
	}
	
	public void deleteStudent(Integer id) {
		Student s=getStudent(id);
		em.remove(s);
		log.info("deleteStudent finished ");
	}
	
	public void insertStudent(Student s) {
		em.persist(s);
		log.info("insertStudent finished ");
	}
	
}
