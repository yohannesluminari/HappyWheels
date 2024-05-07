package it.team2.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vehicle extends BaseEntity {
    private String targa;
    private List<Maintenance> maintenances = new ArrayList<>();

    public Vehicle(){

    }

}