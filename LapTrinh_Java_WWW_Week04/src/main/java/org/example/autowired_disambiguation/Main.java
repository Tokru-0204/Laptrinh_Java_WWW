package org.example.autowired_disambiguation;

import org.example.autowired.AppConfig;
import org.example.autowired.MyNumberFormatterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyNumberFormatterService svc = ctx.getBean(MyNumberFormatterService.class);
        svc.printFormat(100d);
    }
}
