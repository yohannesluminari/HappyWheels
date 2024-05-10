package it.epicode.classi.purchase;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.StringJoiner;

@Entity
@DiscriminatorValue("R")
public class ReSeller extends Seller {
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    public ReSeller(){

    }

    public ReSeller(String name) {
        this.name = name;
    }

    public ReSeller(String location, String name) {
        super(location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ReSeller.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
