package com.seleniumexpress.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;

//	public void setHeart(Heart heart) { // setter and constructor is not needed if we use
//		this.heart = heart; //@Autowired   //@Qualifier("octopusHeart")     //private Heart heart;
//		System.out.println("Set Autowire heart object created");
//	}
	
	/*                                   OR                         */
	
	
//  private Heart heart;
	
//	@Autowired // for setheart object autowiring
//	@Qualifier("humanHeart")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("Set Autowire heart object created");
//	}
	
//	public Human() {
//	}
//	
//	@Autowired // for constructor autowiring
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("Autowired object constructed");
//	}
	
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("Set heart object");
//	}
	
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("Heart object constructed");
//	}

	public void startPumping() {

		if (heart != null) {
			heart.pump();
			System.out.println(heart.getNameOfAnimal()+ "'s heart is pumping");
		} else {
			System.out.println("You are dead");
		}

	}
}
