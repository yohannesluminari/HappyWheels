package it.team2.entities;

import java.time.LocalDate;
import java.util.Date;

public class CardSubscription extends BaseEntity {
    private long codeCard;
    private LocalDate erogationDate;
    private LocalDate expirationDate;
    private Subscription subscription;
    private User user;


    @Override
    public String toString() {
        return "CardSubscription{" +
                "codeCard=" + codeCard +
                ", erogationDate=" + erogationDate +
                ", expirationDate=" + expirationDate +
                ", subscription=" + subscription +
                ", user=" + user +
                '}';
    }

    public CardSubscription(User user, Subscription subscription, LocalDate expirationDate, LocalDate erogationDate, long codeCard) {
        this.user = user;
        this.subscription = subscription;
        this.expirationDate = expirationDate;
        this.erogationDate = erogationDate;
        this.codeCard = codeCard;
    }

    public CardSubscription(){

    }

    public long getCodeCard() {
        return codeCard;
    }

    public void setCodeCard(long codeCard) {
        this.codeCard = codeCard;
    }

    public LocalDate getErogationDate() {
        return erogationDate;
    }

    public void setErogationDate(LocalDate erogationDate) {
        this.erogationDate = erogationDate;
    }


    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
