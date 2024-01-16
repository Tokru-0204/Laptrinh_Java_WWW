package org.example.ConfiguringBeans1;

import org.example.ConfiguringBeans1.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student st2 = context.getBean("st2", Student.class);
        System.out.println(st2);
    }
}
