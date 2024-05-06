package it.team2;

import it.team2.entities.Subscription;
import it.team2.entities.SubscriptionType;
import it.team2.entities.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        var abbM = new Subscription(SubscriptionType.MONTHLY);
        var abbS = new Subscription(SubscriptionType.WEEKLY);
        var ticket1 = new Ticket(true);


        log.debug("{}", ticket1);
        log.debug("{}", abbM);
        log.debug("{}", abbS);
    }
}
