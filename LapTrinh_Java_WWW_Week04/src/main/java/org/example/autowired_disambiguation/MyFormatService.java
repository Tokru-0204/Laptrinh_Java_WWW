package org.example.autowired_disambiguation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyFormatService {
    private  MyFormatter formatter;

    public MyFormatService(@Qualifier("myDataTimeFormatter") MyFormatter formatter){
        this.formatter = formatter;
    }

    public void printFormat(){
        System.out.println(formatter.format());
    }
}
