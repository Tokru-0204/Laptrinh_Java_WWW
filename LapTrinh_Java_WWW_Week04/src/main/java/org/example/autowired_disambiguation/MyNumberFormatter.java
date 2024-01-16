package org.example.autowired_disambiguation;

import org.springframework.stereotype.Component;

@Component("myNumberFormatter") // bean name
public class MyNumberFormatter implements MyFormatter{
    public String format(double number){
        return "My Number Format";
    }

    @Override
    public String format() {
        return "My Number Formatter";
    }
}
