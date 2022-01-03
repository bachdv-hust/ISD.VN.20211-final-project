package isd.vn.ecobike.data.repositories;

import isd.vn.ecobike.data.local.EcoBikeDatabase;
import isd.vn.ecobike.data.local.dao.BikeDao;
import isd.vn.ecobike.domain.repositories.RentBikeRepositoryInterface;

public class RentBikeRepositoryImpl implements RentBikeRepositoryInterface {
    private EcoBikeDatabase database = EcoBikeDatabase.getInstance();

    private BikeDao bikeDao = database.getBikeDao();


}
