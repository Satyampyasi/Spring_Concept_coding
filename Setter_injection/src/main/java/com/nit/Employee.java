package com.nit;

public class Employee {
	Manager manager;
	private int age;

	
	public void  setManager(Manager manager) {
		this.manager=manager;
		
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void info() {
		System.out.println("Manager injected in Employee ( Setter injection)");
		manager.work();
		System.out.println("Age is:"+age);
		
	}

}
