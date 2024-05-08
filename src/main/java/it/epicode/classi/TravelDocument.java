package it.epicode.classi;

import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
public abstract class TravelDocument extends BaseEntity {
    @Column(name = "code", length = 50)
    long code;
    @Column(name = "start_date")
    LocalDate startDate;
    @Column(name = "end_date")
    LocalDate endDate;

    public TravelDocument() {
        this.startDate = LocalDate.now();

    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
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
