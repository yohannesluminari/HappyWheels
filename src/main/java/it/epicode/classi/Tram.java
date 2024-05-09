package it.epicode.classi;

import java.sql.Time;
import java.time.LocalTime;

public class Tram extends Vehicle{
    public Tram(String licensePlate, String departure, String arrive, LocalTime trackDuration, int counterTrack) {
        super(licensePlate, departure, arrive, trackDuration, counterTrack);
    }


}

