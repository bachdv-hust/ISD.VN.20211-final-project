package isd.vn.ecobike.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class BikeEntity {
    @PrimaryKey
    public int id;
    public int type;
    public String image;
    public boolean isRenting;
    public int value;
    public String barCode;
    public int stationID;
}
