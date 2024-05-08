package it.epicode;

import it.epicode.Enum.SubscriptionType;
import it.epicode.classi.Subscription;
import it.epicode.classi.User;
import it.epicode.dao.interfaces.TravelDocumentDao;
import it.epicode.dao.jpa.JpaTravelDocumentDao;
import it.epicode.dao.jpa.JpaUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Main {

    protected static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        User Antonio = new User("Antonio","Schipani", LocalDate.of(1998,3,7));
        var userDao = new JpaUserDao();
        userDao.save(Antonio);
        Subscription abb1 = new Subscription( SubscriptionType.MONTHLY);
        var travelDAo = new JpaTravelDocumentDao();
        travelDAo.save(abb1);
    }
}