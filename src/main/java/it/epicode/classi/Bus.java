package it.epicode.classi;

import jakarta.persistence.Entity;

import java.time.LocalTime;

@Entity
public class Bus extends Vehicle{

    public Bus(String licensePlate, String departure, String arrive, LocalTime trackDuration, int counterTrack) {
        super(licensePlate, departure, arrive, trackDuration, counterTrack);
        super.setCapacity(50);
    }
}
