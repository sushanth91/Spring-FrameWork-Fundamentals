package com.seleniumexpress.ioc;

public class Vodaphone implements Sim {


	@Override
	public void calling() {
		System.out.println("calling using Vodaphone sim");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using Vodaphone sim");
	}

}
