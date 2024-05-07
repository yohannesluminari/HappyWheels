package it.team2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "user")
public class User extends BaseEntity{
    @Column(name = "name", length  = 80)
    private String name;

    @Column(name = "surname", length  = 80)
    private String surname;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    private boolean IsCardValid = true;

    @Embedded
    private CardSubscription card;

    public User(String name, String surname, LocalDate birthDate, CardSubscription card) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.card = card;
    }
    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", IsCardValid=" + IsCardValid +
                ", card=" + card +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isCardValid() {
        return IsCardValid;
    }

    public void setCardValid(boolean cardValid) {
        IsCardValid = cardValid;
    }

    public CardSubscription getCard() {
        return card;
    }

    public void setCard(CardSubscription card) {
        this.card = card;
    }

// dobbiamo inserire una classe tessera sempre per tutti gli user e dobbiamo aggiungere la posssibilità di riattivarala
    //diosuino

}
