package isd.vn.ecobike.data.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import isd.vn.ecobike.data.entity.StationEntity;

@Dao
public interface StationDao {
    @Insert
    void insertAll(StationEntity... bikes);

    @Delete
    void delete(StationEntity bike);

    @Query("SELECT * FROM 'stationentity'")
    List<StationEntity> getAll();
}
