package org.example.resources;

import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.IOException;

import static java.io.File.*;


public class ClientBean {
    @Value("classpath:beans.xml")
    private Resource myResource;

    @Value("${foo.permission}")
    private String permission;

    public void doSomething() throws IOException {
        File file = myResource.getFile();
//        String s = new String(File.readAllBytes(file.toPath()));
//        System.out.println(s);
        System.out.println(permission);
    }
}
