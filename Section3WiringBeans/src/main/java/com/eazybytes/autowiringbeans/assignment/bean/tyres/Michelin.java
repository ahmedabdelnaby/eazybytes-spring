package com.eazybytes.autowiringbeans.assignment.bean.tyres;

import org.springframework.stereotype.Component;

@Component("michelinTyres")
public class Michelin implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with michelinTyres";
    }
}
