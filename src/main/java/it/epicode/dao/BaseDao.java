package it.epicode.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseDao {
    protected static final Logger log = LoggerFactory.getLogger(BaseDao.class);
    protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("HotWheels");
    protected final EntityManager em = emf.createEntityManager();
}
