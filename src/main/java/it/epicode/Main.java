package it.epicode;

import it.epicode.classi.*;
import it.epicode.dao.jpa.JpaSellerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Main {

    protected static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args){
        var sellerDao = new JpaSellerDao();
        Seller seller1 = new VendingMachine("Roma");
        Seller seller2 = new ReSeller("Cosenza", "Bar Jolly");
        sellerDao.save(seller1);
        sellerDao.save(seller2);
    }
}