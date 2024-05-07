package it.team2.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vehicle extends BaseEntity {
    private String targa;
    private List<Maintenance> maintenances = new ArrayList<>();
    private State state;

    public Vehicle(){

    }
    public Vehicle(String targa, State state) {
        this.targa = targa;
        this.state = state;
    }

    // Getters and setters

    public void addMaintenance(Maintenance maintenance) {
        maintenances.add(maintenance);
        state = State.UNDER_MAINTENANCE;
    }

    public void completeMaintenance(Maintenance maintenance) {
        maintenances.setEndDate(new Date());
        state = State.IN_SERVICE;
    }
}