package com.rest.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int id;
	private String course;

	@OneToMany(mappedBy = "course")
	private List<Review> review = new ArrayList<Review>();

	
	public int getId() {
		return id;
	}

	public List<Review> getReview() {
		return review;
	}

	public void removeReview(Review review) {
		this.review.remove(review);
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	public int getCouse_id() {
		return id;
	}

	public String getCourse() {
		return course;
	}

	public void setCouse_id(int id) {
		this.id = id;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + "]";
	}

}
