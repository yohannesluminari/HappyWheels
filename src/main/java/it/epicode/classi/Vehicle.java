package it.epicode.classi;


import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Vehicle extends BaseEntity {
    private String licensePlate;
    private String departure;
    private String arrive;
    private LocalTime trackDuration;
    private int counterTrack;

    public Vehicle(String licensePlate, String departure, String arrive, LocalTime trackDuration, int counterTrack) {
        this.licensePlate = licensePlate;
        this.departure = departure;
        this.arrive = arrive;
        this.trackDuration = trackDuration;
        this.counterTrack = counterTrack;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", departure='" + departure + '\'' +
                ", arrive='" + arrive + '\'' +
                ", trackDuration=" + trackDuration +
                ", counterTrack=" + counterTrack +
                '}';
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public LocalTime getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(LocalTime trackDuration) {
        this.trackDuration = trackDuration;
    }

    public int getCounterTrack() {
        return counterTrack;
    }

    public void setCounterTrack(int counterTrack) {
        this.counterTrack = counterTrack;
    }
}
