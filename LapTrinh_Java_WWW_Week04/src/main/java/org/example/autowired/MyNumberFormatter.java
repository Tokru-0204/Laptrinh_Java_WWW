package org.example.autowired;

import org.springframework.stereotype.Component;

@Component
public class MyNumberFormatter {
    public String format(double number){
        return "My Number Format-" + number;
    }
}
