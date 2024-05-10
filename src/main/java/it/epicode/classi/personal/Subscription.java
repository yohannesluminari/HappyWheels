package it.epicode.classi.personal;

import it.epicode.Enum.SubscriptionType;
import it.epicode.classi.purchase.Seller;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.StringJoiner;
@Entity
@DiscriminatorValue("S")
public class Subscription extends TravelDocument {
    @Enumerated(EnumType.STRING)
    @Column(name = "subscription_type", nullable = false)
    private SubscriptionType subscriptionType;
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;


    public Subscription(Seller seller, SubscriptionType subscriptionType) {
        super(seller.getLocation());
        this.startDate = LocalDate.now();
        this.subscriptionType = subscriptionType;
        if(this.subscriptionType == SubscriptionType.WEEKLY){
            setEndDate(getStartDate().plusWeeks(1));
        }else if (this.subscriptionType == SubscriptionType.MONTHLY){
            setEndDate(getStartDate().plusMonths(1));
        }
    }
    public Subscription(){

    }


    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
