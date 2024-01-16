package org.example.autowired_disambiguation;

import org.springframework.stereotype.Component;

@Component
public class MyDataTimeFormatter implements MyFormatter {
    @Override
    public String format(){
        return "My Date time Formatter";
    }
}
