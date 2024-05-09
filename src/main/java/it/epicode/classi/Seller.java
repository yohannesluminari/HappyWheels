package it.epicode.classi;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "seller_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Seller extends BaseEntity {
    private String location;

    public Seller() {

    }

    public Seller(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
