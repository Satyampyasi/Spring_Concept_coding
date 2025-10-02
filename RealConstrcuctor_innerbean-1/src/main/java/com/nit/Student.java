package com.nit;

public class Student {
	private Address address;
	private String name;
	private int rollNo;
	private float marks;
	public Student(Address address, String name, int rollNo, float marks) {
		super();
		this.address = address;
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno :"+rollNo);
		System.out.println("Marks: "+marks);
		System.out.println(address);
	}

}
