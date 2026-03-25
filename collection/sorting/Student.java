package com.rays.collection.sorting;

public class Student {
	
	private int id;
	private String name;
	private String address;
	
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Address: " + address;
	}

}
