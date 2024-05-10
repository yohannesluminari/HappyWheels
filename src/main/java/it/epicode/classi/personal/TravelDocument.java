package it.epicode.classi.personal;

import it.epicode.classi.BaseEntity;
import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "ticket_type", discriminatorType = DiscriminatorType.STRING)
public abstract class TravelDocument extends BaseEntity {
    @Column(name = "code", length = 50)
    double code;
    @Column(name = "seller")
    private String seller;

    public TravelDocument(String issuingPoint) {
        this.code = (int)(Math.random()*1000);
        this.seller = issuingPoint;
    }
    public TravelDocument(){

    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }


}
