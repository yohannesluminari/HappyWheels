package it.epicode.dao.jpa;

import it.epicode.classi.Vehicle;
import it.epicode.dao.BaseDao;
import it.epicode.dao.interfaces.VehicleDao;

import java.util.prefs.BackingStoreException;

public  class JpaVehicleDao extends BaseDao implements VehicleDao{

    @Override
    public void save(Vehicle vehicle) {

    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return null;
    }
}
