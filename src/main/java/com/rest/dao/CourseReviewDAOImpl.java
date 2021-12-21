package com.rest.dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.rest.models.Course;
import com.rest.models.Review;
import com.rest.models.Student;

@Repository
@Transactional
public class CourseReviewDAOImpl {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public void courseReviewInsert() {

		Course course = new Course();
		course.setCourse("Java");
		em.persist(course);

		Review review = new Review();
		review.setReview("Very Good");
		review.setCourse(course);
		em.persist(review);
	}
	
	@Transactional(isolation = Isolation.READ_COMMITTED)
	public void fetchCourseReview() {
		
		//Course c=em.find(Course.class, 1);
		//log.info("Course -> {} ",c);
		
		Review r=em.find(Review.class, 2);
		log.info("Review -> {} ",r);
		log.info("getCourse ->" +r.getCourse());
		
		
	}

}
