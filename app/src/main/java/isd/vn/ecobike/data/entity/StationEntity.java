package isd.vn.ecobike.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class StationEntity {
    @PrimaryKey
    public int id;
    public String name;
    public String area;
    public String address;
    public int numAvailableBike;
    public int numEmptyDockPoint;
}
