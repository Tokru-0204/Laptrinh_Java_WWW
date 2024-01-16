package org.example.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlbased_beans.xml");
        Student st3 = context.getBean("st3", Student.class);
        System.out.println(st3);
    }
}
