package com.ioc.spring;

public class A implements Coach {
	private returnFortune fortuneserv;
	
	
	
	public A(returnFortune fortuneserv) {
		this.fortuneserv = fortuneserv;
	}

	public A() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String returnString() {
		return "From A";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneserv.getFortune();
	}

}
