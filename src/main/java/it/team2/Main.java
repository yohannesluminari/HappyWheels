package it.team2;

import it.team2.dao.JpaUserDao;
import it.team2.entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Date;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        var antonio = new User("Antonio", "Schipani", LocalDate.of(1998,3,7),new CardSubscription(2222,SubscriptionType.MONTHLY));
        var abbM = new Subscription(SubscriptionType.MONTHLY);
        var abbS = new Subscription(SubscriptionType.WEEKLY);
        var ticket1 = new Ticket(true);

        var jpa = new JpaUserDao();

        jpa.saveUser(antonio);
        log.debug("{}", ticket1);
        log.debug("{}", abbM);
        log.debug("{}", abbS);
        log.debug("{}",antonio);
    }
}
