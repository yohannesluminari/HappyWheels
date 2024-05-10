package it.epicode.classi.personal;

import it.epicode.classi.BaseEntity;
import it.epicode.classi.purchase.Seller;
import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "ticket_type", discriminatorType = DiscriminatorType.STRING)
public abstract class TravelDocument extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
    @Column(name = "code", length = 50)
    double code;
    @Column(name = "seller")
    private String sellerLocation;

    public TravelDocument(String issuingPoint) {
        this.code = (int)(Math.random()*1000);
        this.sellerLocation = issuingPoint;
    }
    public TravelDocument(){

    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getSellerLocation() {
        return sellerLocation;
    }

    public void setSellerLocation(String seller) {
        this.sellerLocation = seller;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }


}
