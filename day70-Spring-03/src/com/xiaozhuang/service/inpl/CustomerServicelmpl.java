package com.xiaozhuang.service.inpl;

import java.util.Date;

public class CustomerServicelmpl implements ICustomerService{
	    private String name;
	    private Integer age;
	    private Date birthday;

	public void setName(String name) {
			this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public void saveCustomer() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(birthday);
		  
	}
}
