package com.nit;

public class Employee {
	Manager manager;
	
	public void  setManager(Manager manager) {
		this.manager=manager;
		
	}
	public void info() {
		System.out.println("Manager injected in Employee ( Setter injection)");
		manager.work();
		
	}

}
