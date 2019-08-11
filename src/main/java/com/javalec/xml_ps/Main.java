package com.javalec.xml_ps;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//set bean by specifying properties directly in xml with no using environment
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");	//container
		
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin ID: " + connection.getAdminId());
		System.out.println("admin PASSWORD: " + connection.getAdminPw());
		System.out.println();
		System.out.println("sub admin ID: " + connection.getSubAdminId());
		System.out.println("sub admin PASSWORD: " + connection.getSubAdminPw());		

		ctx.close();
	}

}
