package com.eazybytes.autowiringbeans.assignment.bean.tyres;

import org.springframework.stereotype.Component;

@Component("bridgeStoneTyres")
public class BridgeStone implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with bridgeStoneTyres";
    }
}
