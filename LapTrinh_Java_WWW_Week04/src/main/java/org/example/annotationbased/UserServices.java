package org.example.annotationbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServices {
    @Bean
   public Group groupService(){
       return new Group("Admin Group");
   }

   @Bean
   public User userService(){
       return new User("teo","123",groupService());
   }
}
