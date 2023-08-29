package com.seleniumexpress.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
        Airtel air = (Airtel) context.getBean("airtel"); // Fix the bean name here
        air.calling();
        air.data();
        
        System.out.println();
        
        Vodaphone voda = context.getBean("vodaphone", Vodaphone.class); // Fix the bean name here
        voda.calling();
        voda.data();
        
        System.out.println();
        
        Sim sim1 = context.getBean("sim1", Sim.class); // Fix the bean name here
        sim1.calling();
        sim1.data();
        
        System.out.println();
        Sim sim2 = context.getBean("sim2", Sim.class); // Fix the bean name here
        sim2.calling();
        sim2.data();
    }
}

