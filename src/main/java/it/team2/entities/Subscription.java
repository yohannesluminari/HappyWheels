package it.team2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.StringJoiner;


@Entity
@Table(name = "subscription")
public class Subscription extends TravelTicket{

    private SubscriptionType subscriptionType;
    private LocalDate purchaseDate;
    private LocalDate expiryDate;
    private CardSubscription cardSubscription;

    public Subscription() {
    }

    public Subscription(SubscriptionType subscriptionType )  {//CardSubscription cardSubscription
        LocalDate now = LocalDate.now();
        this.subscriptionType = subscriptionType;
        this.purchaseDate = now;
        //this.cardSubscription = cardSubscription;

        if (this.subscriptionType == SubscriptionType.WEEKLY){
            this.expiryDate = this.purchaseDate.plusDays(7);
        } else if (this.subscriptionType == SubscriptionType.MONTHLY) {
            this.expiryDate = this.purchaseDate.plusDays(30);
        }
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CardSubscription getCardSubscription() {
        return cardSubscription;
    }

    public void setCardSubscription(CardSubscription cardSubscription) {
        this.cardSubscription = cardSubscription;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Subscription.class.getSimpleName() + "[", "]")
                .add("subscriptionType=" + subscriptionType)
                .add("purchaseDate=" + purchaseDate)
                .add("expiryDate=" + expiryDate)
                .add("cardSubscription=" + cardSubscription)
                .toString();
    }
}
