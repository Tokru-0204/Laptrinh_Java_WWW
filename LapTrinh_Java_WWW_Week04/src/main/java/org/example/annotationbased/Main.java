package org.example.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(UserServices.class);
        User u = ctx.getBean(User.class);
        System.out.println(u);
    }
}
