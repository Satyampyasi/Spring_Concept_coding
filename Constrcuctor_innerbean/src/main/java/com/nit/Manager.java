package com.nit;

public class Manager {
private Address address;
private String name;
private int rollNo;
private float marks;
public Address getAddress() {
	return address;
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
	System.out.println("Rollno : "+rollNo);
	System.out.println("Marks: "+marks);
	System.out.println("Address:"+address);
}


}
