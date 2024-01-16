package org.example.ConfiguringBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Student st1 = context.getBean("st1", Student.class);
    System.out.println(st1);
    }
}
