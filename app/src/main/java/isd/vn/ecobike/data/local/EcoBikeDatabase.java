package isd.vn.ecobike.data.local;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import isd.vn.ecobike.common.utils.AppUtils;
import isd.vn.ecobike.data.entity.UserEntity;
import isd.vn.ecobike.data.local.dao.BikeDao;
import isd.vn.ecobike.data.local.dao.UserDao;

@Database(entities ={UserEntity.class}, version = 1, exportSchema = false)
public abstract class EcoBikeDatabase  extends RoomDatabase {
    public abstract UserDao getUserDao();
    public abstract BikeDao getBikeDao();
    private static EcoBikeDatabase instance;

    public static synchronized EcoBikeDatabase getInstance() {
        if (instance == null) {
            instance = Room.databaseBuilder(AppUtils.getAppContext(),  EcoBikeDatabase.class,"DB_NAME")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
