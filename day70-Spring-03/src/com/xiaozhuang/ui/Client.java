package com.xiaozhuang.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaozhuang.service.inpl.CustomerServicelmpl;
import com.xiaozhuang.service.inpl.ICustomerService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		ICustomerService is = (CustomerServicelmpl)ac.getBean("we");
		
		is.saveCustomer();
	}

}
