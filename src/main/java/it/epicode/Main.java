package it.epicode;

import it.epicode.classi.User;
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
    }
}