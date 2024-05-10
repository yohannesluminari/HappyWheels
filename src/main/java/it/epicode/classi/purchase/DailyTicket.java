package it.epicode.classi.purchase;

import it.epicode.classi.personal.TravelDocument;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("T")
public class DailyTicket extends TravelDocument {
    @Column(nullable = false)
    private boolean validated;


    public DailyTicket() {
    }


    public DailyTicket(Seller seller) {
        super(seller.getLocation());
        this.validated = false;
    }


    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

}
