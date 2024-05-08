package it.epicode.classi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class TravelDocument extends BaseEntity {
    @Id
    @GeneratedValue
    private long code;
    private LocalDate startDate;
    private LocalDate endDate;

    public TravelDocument() {

    }

    @Override
    public String toString() {
        return "TravelDocument{" +
                "code=" + code +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
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
