package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
Student bean = con.getBean(Student.class);
bean.display(); 

	}

}
