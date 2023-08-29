package com.seleniumexpress.dependency.without_dependency_injection;

public class Client {
	
	public static void main(String[] args) {
		Student student = new Student();
		MathCheat cheat = new MathCheat();
		student.setMathCheat(cheat);
		student.cheating();
	}

}
