package it.epicode;

import it.epicode.Enum.SubscriptionType;
import it.epicode.classi.*;
import it.epicode.dao.jpa.JpaMaintenanceDao;
import it.epicode.dao.jpa.JpaTravelDocumentDao;
import it.epicode.dao.jpa.JpaUserDao;
import it.epicode.dao.jpa.JpaVehicleDao;
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
        var vehicleDao = new JpaVehicleDao();


        var tram1 = new Tram("3l3fred","Termini","Tiburtina",LocalTime.parse("00:30") ,3);
        log.debug("{}",tram1);
        var bus = new Bus("3l4fred","Termini","Tiburtina",LocalTime.parse("00:30") ,5);
        log.debug("{}",bus);
        vehicleDao.save(tram1);
        vehicleDao.save(bus);
        var maintenence1 = new Maintenance (vehicleDao.getVehicleById(1L),LocalDate.now());
        var maintenanceDao = new JpaMaintenanceDao();
        maintenanceDao.save(maintenence1);
    }
}