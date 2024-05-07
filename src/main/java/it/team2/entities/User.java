package it.team2.entities;

import java.time.LocalDate;
import java.util.Date;

public class User extends BaseEntity{
    private String name;
    private String surname;
    private LocalDate birthDate;
    private boolean cardSubscription = false;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", cardSubscription=" + cardSubscription +
                '}';
    }

    public User(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
    public User(){

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
// dobbiamo inserire una classe tessera sempre per tutti gli user e dobbiamo aggiungere la posssibilità di riattivarala
    //diosuino

}
