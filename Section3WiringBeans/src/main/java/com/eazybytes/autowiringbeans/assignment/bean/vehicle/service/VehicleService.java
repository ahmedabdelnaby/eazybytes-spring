package com.eazybytes.autowiringbeans.assignment.service.vehicle;

import com.eazybytes.autowiringbeans.assignment.bean.speaker.Speaker;
import com.eazybytes.autowiringbeans.assignment.bean.tyres.Tyres;

public interface VehicleService {
    Speaker speaker = null;
    Tyres tyres = null;

    void playQuraan();
    void moveVehicle();
}
