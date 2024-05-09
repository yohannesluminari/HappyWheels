package it.epicode;

import it.epicode.Enum.SubscriptionType;
import it.epicode.classi.*;
import it.epicode.dao.jpa.JpaTravelDocumentDao;
import it.epicode.dao.jpa.JpaUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    protected static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        User Antonio = new User("Antonio","Schipani", LocalDate.of(1998,3,7));
        var userDao = new JpaUserDao();
        userDao.save(Antonio);
        Subscription abb1 = new Subscription( SubscriptionType.MONTHLY);
        var travelDAo = new JpaTravelDocumentDao();
        Subscription abb2 = new Subscription( SubscriptionType.WEEKLY);
        travelDAo.save(abb1);
        travelDAo.save(abb2);


        var tram1 = new Tram("3l3fred","termini","tiburtina",LocalTime.parse("00:30") ,3);
        log.debug("{}",tram1);
        var bus = new Bus("3l4fred","termini","tiburtina",LocalTime.parse("00:30") ,5);
        log.debug("{}",bus);
    }
}