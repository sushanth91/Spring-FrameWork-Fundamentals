package com.seleniumexpress.dependency.without_dependency_injection;

public class Student {
	MathCheat mathCheat;

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheat();
	}

}

/* Creating Object using tight coupling( Means using new key word) */
//	static MathCheat mathCheat = new MathCheat();
//	
//	public static void main(String[] args) {
//		cheating();
//	}
//	
//	
//	public static void cheating() {
//		mathCheat.mathCheat();
//	}
