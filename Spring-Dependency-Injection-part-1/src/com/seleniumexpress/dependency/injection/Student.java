package com.seleniumexpress.dependency.injection;
public class Student {
    	
		private int id;	
    	private String studentName;
    	
    	
    	/*                     Setter Injection Example                   */
    	
    	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
			System.out.println("Setter method setId is called : "+ getId());
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
			System.out.println("Setter method setStudentName is called : "+getStudentName());
		}
		

		public void displayStudentInfo(){
    		System.out.println("Student name is : " + getStudentName()+" and student id is : "+ getId());
    	}
		
		
		/*                     Constructor Injection Example                 */
    	
    	 public Student() {
    	    }
		
    	 public Student(int id) {
 			this.id = id;
 			System.out.println("Constructor is called studentName : = "+studentName+" and id : = "+id+" initialized");
 		}
    	 
    	 
		public Student(int id, String studentName) {
			this.id = id;
			this.studentName = studentName;
			System.out.println("Constructor is called studentName : = "+studentName+" and id : = "+id+" initialized");
		}

		

		
		public void displayStudentInfoConstructor(){
    		System.out.println("Student name is : " + studentName+" and student id is : "+ id);
    	}
		
		
}

    		
//    	
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        System.out.println("config loaded");
//        Student air = (Student) context.getBean("airtel"); // Fix the bean name here
//      
//        
//        System.out.println();
//        Sim sim2 = context.getBean("sim2", Sim.class); // Fix the bean name here
//        sim2.calling();
//        sim2.data();
    


