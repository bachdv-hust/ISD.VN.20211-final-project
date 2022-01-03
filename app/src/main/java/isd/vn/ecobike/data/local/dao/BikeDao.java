package isd.vn.ecobike.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import isd.vn.ecobike.data.entity.BikeEntity;

@Dao
public interface BikeDao {
    @Insert
    void insertAll(BikeEntity... bikes);

    @Delete
    void delete(BikeEntity bike);

    @Query("SELECT * FROM 'bikeentity'")
    List<BikeEntity> getAll();
}
