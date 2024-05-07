package it.team2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.util.Date;

@Embeddable
public class CardSubscription extends BaseEntity {

    @Column(name = "codeCard", length  = 80)
    private long codeCard;

    @Column(name = "erogationDate", length  = 80)
    private LocalDate erogationDate;

    @Column(name = "expirationDate", length  = 80)
    private LocalDate expirationDate;

    @Column(name = "subscription", length  = 80)
    private Subscription subscription;

    @Override
    public String toString() {
        return "CardSubscription{" +
                "codeCard=" + codeCard +
                ", erogationDate=" + erogationDate +
                ", expirationDate=" + expirationDate +
                ", subscription=" + subscription +
                '}';
    }

    public CardSubscription(long codeCard, SubscriptionType subscriptionType) {
        LocalDate now = LocalDate.now();

        this.erogationDate = now;
        this.expirationDate = now.plusYears(1);
        this.codeCard = codeCard;
        if (subscriptionType == SubscriptionType.WEEKLY){
            this.subscription = new Subscription(SubscriptionType.WEEKLY);
        }else if(subscriptionType == SubscriptionType.MONTHLY) {
            this.subscription = new Subscription(SubscriptionType.MONTHLY);
        }
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

}
