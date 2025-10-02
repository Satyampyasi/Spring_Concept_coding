package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");	
     Manager bean = con.getBean(Manager.class);
     bean.display();

	}

}
