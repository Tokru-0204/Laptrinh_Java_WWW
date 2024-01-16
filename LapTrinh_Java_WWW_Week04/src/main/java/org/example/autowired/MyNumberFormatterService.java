package org.example.autowired;

import org.springframework.stereotype.Component;

@Component
public class MyNumberFormatterService {
    private final MyNumberFormatter myNumberFormatter;

    public MyNumberFormatterService(MyNumberFormatter myNumberFormatter){
        this.myNumberFormatter = myNumberFormatter;
    }

    public void printFormat(double number){
        System.out.println(myNumberFormatter.format(number));
    }
}
