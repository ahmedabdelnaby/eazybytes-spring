package com.eazybytes.autowiringbeans.assignment.bean.speaker;

import org.springframework.stereotype.Component;

@Component("boseSpeaker")
public class Bose implements Speaker {
    @Override
    public String makeSound() {
        return "Playing Quraan from boseSpeaker";
    }
}
