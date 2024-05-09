package it.epicode.classi;

import it.epicode.Enum.SubscriptionType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;
import java.util.StringJoiner;
@Entity
public class Subscription extends TravelDocument {
    @Enumerated(EnumType.STRING)
    @Column(name = "subscription_type", nullable = false)

    private SubscriptionType subscriptionType;

    public Subscription(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
        if(this.subscriptionType == SubscriptionType.WEEKLY){
            setEndDate(getStartDate().plusWeeks(1));
        }else if (this.subscriptionType == SubscriptionType.MONTHLY){
            setEndDate(getStartDate().plusMonths(1));
        }
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Subscription.class.getSimpleName() + "[", "]")
                .add("subscriptionType=" + subscriptionType)
                .add("code=" + code)
                .add("startDate=" + startDate)
                .add("endDate=" + endDate)
                .toString();
    }
}
