package com.eazybytes.autowiringbeans.assignment.bean.speaker;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sonySpeaker")
@Primary
public class Sony implements Speaker {
    @Override
    public String makeSound() {
        return "Playing Quraan with sonySpeaker";
    }
}
