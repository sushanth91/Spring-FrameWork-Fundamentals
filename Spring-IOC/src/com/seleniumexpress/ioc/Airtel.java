package com.seleniumexpress.ioc;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("Airtel constroctor called");
	}

	@Override
	public void calling() {
		System.out.println("calling using Airtel sim");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using Airtel sim");
		
	}

}
