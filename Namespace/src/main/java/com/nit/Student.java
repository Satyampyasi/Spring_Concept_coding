package com.nit;

public class Student {
 private String name;
 private int  rollno;
 Teacher teacher;
 
 
 public Teacher getTeacher() {
	return teacher;
}
 public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public int getRollno() {
	return rollno;
 }
 public void setRollno(int rollno) {
	this.rollno = rollno;
 }
 public void display() {
	 System.out.println("Name is "+name);
	 System.out.println("Roll no is"+rollno);
	 System.out.println("Teacher"+teacher);
 }
 

}
