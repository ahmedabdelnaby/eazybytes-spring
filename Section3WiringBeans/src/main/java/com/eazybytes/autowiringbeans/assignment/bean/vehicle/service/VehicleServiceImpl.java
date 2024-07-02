package com.eazybytes.autowiringbeans.assignment.bean.vehicle.service;

import com.eazybytes.autowiringbeans.assignment.bean.speaker.Speaker;
import com.eazybytes.autowiringbeans.assignment.bean.tyres.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    public Speaker speaker;
    public Tyres tyres;


    @Autowired
    public VehicleServiceImpl(@Qualifier("sonySpeaker") Speaker speaker, @Qualifier("michelinTyres") Tyres tyres) {
        this.speaker = speaker;
        this.tyres = tyres;
    }

    public void playQuraan() {
        String quraan = speaker.makeSound();
        System.out.println(quraan);
    }

    public void moveVehicle() {
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
