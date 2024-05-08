package it.epicode.dao.jpa;

import it.epicode.classi.User;
import it.epicode.dao.BaseDao;
import it.epicode.dao.interfaces.UserDao;

public class JpaUserDao extends BaseDao implements UserDao {


    @Override
    public void save(User user) {
        try{
            var t = em.getTransaction();
            t.begin();
            em.persist(user);
            t.commit();
        }catch (Exception ex){
            log.error("e andata male" + ex);
        }
    }


    @Override
    public User getUserById(Long id) {
        return em.find(User.class,id);
    }
}

