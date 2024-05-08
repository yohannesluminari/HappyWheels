package it.epicode.classi;

import it.epicode.Enum.SubscriptionType;

import java.time.LocalDate;
public class Subscription extends TravelDocument {
    private SubscriptionType subscriptionType;

    public Subscription(SubscriptionType subscriptionType) {
        super();
        this.subscriptionType = subscriptionType;
        if(this.subscriptionType == SubscriptionType.WEEKLY){
            setEndDate(getStartDate().plusWeeks(1));
        }else if (this.subscriptionType == SubscriptionType.MONTHLY){
            setEndDate(getStartDate().plusMonths(1));
        }
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "subscriptionType=" + subscriptionType +
                '}';
    }



}
