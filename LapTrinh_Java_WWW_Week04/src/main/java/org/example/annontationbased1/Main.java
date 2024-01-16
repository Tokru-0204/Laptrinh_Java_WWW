package org.example.annontationbased1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User us = (User) ctx.getBean("user");
        us.doFoo();
        System.out.println(us);
    }
}
