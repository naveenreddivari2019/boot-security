package com.rest.models;

public class Books {

	private int id;
	private String name;

	public Books(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + "]";
	}

}
