package com.nit;

public class Student {
	private Address address;
	private String name;
	private int rollNo;
	private float marks;

	
	public Address getAddress() {
		return address;
	}

	public Student(Address address, String name, int rollNo, float marks) {
		super();
		this.address = address;
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno :"+rollNo);
		System.out.println("Marks: "+marks);
		System.out.println(address);
	}

}
