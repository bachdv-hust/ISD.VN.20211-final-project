package isd.vn.ecobike.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class BaseBikeEntity {
    @PrimaryKey
    public int id;
    public String image;
    public boolean isRenting;
    public int value;
    public String barCode;
    public int stationID;
}
