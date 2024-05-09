package it.epicode.classi;

import jakarta.persistence.Entity;

import java.time.LocalTime;

@Entity
public class Tram extends Vehicle{
    public Tram(String licensePlate, String departure, String arrive, LocalTime trackDuration, int counterTrack) {
        super(licensePlate, departure, arrive, trackDuration, counterTrack);
        super.setCapacity(80);
    }
}
