package org.example.resources;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                new
                        AnnotationConfigApplicationContext(AppConfig.class);
        ClientBean bean = context.getBean(ClientBean.class);
        bean.doSomething();

    }
}
