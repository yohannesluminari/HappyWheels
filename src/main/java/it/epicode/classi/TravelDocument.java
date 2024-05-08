package it.epicode.classi;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Random;


@Entity
public abstract class TravelDocument extends BaseEntity {
    @Column(name = "code", length = 50)
    double code;
    @Column(name = "start_date")
    LocalDate startDate;
    @Column(name = "end_date")
    LocalDate endDate;

    public TravelDocument() {
        this.startDate = LocalDate.now();
        this.code = (int)(Math.random()*1000);
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
