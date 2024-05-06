package it.team2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.StringJoiner;

@Entity
@Table(name = "ticket")
public class Ticket extends TravelTicket{
    @Column(name = "verified")
    private boolean verified;

    private LocalDate purchaseDate;

    public Ticket(boolean verified) {
        LocalDate now = LocalDate.now();
        this.verified = verified;
        this.purchaseDate = now;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ticket.class.getSimpleName() + "[", "]")
                .add("verified=" + verified)
                .add("purchaseDate=" + purchaseDate)
                .toString();
    }
}
