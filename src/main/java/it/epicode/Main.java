package it.epicode;

import it.epicode.classi.User;
import it.epicode.dao.BaseDao;
import it.epicode.dao.jpa.JpaUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        final Logger log = LoggerFactory.getLogger(Main.class);
        User Antonio = new User("Antonio","Schipani", LocalDate.of(1998,3,7));
        var jpa = new JpaUserDao();
        jpa.save(Antonio);
        log.debug("{}",Antonio);
    }
}