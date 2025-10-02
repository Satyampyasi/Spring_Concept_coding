package com.nit;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
		 Student bean = context.getBean(Student.class);
		    bean.display();

	}

}
