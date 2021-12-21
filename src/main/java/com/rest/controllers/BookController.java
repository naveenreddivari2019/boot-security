package com.rest.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.models.Books;

@RestController
public class BookController {

	@RequestMapping("/books")
	public List<Books> getAllBooks(){
		
		/*
		 * List<Books> l=new ArrayList<Books>(); l.add(new Books(1,"JAVA")); l.add(new
		 * Books(2,"ORACLE"));
		 */
		return Arrays.asList(new Books(1,"JAVA"),new Books(2,"ORACLE")); 
	}
}
