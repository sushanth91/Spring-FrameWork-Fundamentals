package com.beanlifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	System.out.println("beans.xml file loaded");
    	System.out.println();
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
        
		/*                                   OR                                     */
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //  ((ClassPathXmlApplicationContext)context).close();
        System.out.println();
        StudentDAO student = context.getBean("studentDAO", StudentDAO.class);
        System.out.println(student);
        System.out.println();
        
        student.selectAllRows();
        System.out.println();
        student.deleteStudentRecord(9);
        
        //((ClassPathXmlApplicationContext)context).close();
        
		/*                                 OR                                             */
        
        context.close(); // 
        
        System.out.println();
        System.out.println("StudentDAO container destroyed");
        
//        context.registerShutdownHook();
//        StudentDAO student1 = context.getBean("studentDAO", StudentDAO.class);
//        System.out.println(student1);
//        System.out.println("student2");
    }

}
