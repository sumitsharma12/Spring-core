package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student stu=context.getBean("ob",Student.class);
		System.out.println(stu);
		System.out.println(stu.getAddress());
		System.out.println(stu.getAddress().getClass().getName());
	}

}
