package vn.com.iuh.fit.BackEnd.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/${app.rest.path}")
public class HealthCheck {
    @GetMapping(path = "/heartbeat")
    public String beat(){
        return "OK";
    }

    @GetMapping(path = "")
    public String hello(){
        return "Hello";
    }
}
