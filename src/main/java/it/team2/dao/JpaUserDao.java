package it.team2.dao;

import it.team2.entities.User;

import java.util.Optional;

public class JpaUserDao extends JpaBaseDao implements UserDao{
    @Override
    public void saveUser(User user) {

        try{
           var t = em.getTransaction();
           t.begin();
           em.persist(user);
           t.commit();
        }catch (Exception ex){
            log.error("Ciuaone mona" + ex.getMessage());
        }
    }

    @Override
    public Optional<User> getUserById(long id) {
        return Optional.ofNullable(em.find(User.class, id));
    }


}
