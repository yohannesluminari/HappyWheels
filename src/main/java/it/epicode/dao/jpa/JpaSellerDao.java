package it.epicode.dao.jpa;

import it.epicode.classi.Seller;
import it.epicode.dao.BaseDao;
import it.epicode.dao.interfaces.SellerDao;

public class JpaSellerDao extends BaseDao implements SellerDao {



    @Override
    public void save(Seller seller) {
        try{
            var t = em.getTransaction();
            t.begin();
            em.persist(seller);
            t.commit();
        }catch (Exception ex){
            log.error("qualquadra non cosa" + ex);
        }
    }

    }
