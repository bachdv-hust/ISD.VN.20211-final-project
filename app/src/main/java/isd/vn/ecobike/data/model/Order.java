package isd.vn.ecobike.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;

@Entity

public class OrderEntity {
    @PrimaryKey
    public int id;
    public BikeEntity rentedBike;
    public LocalDateTime start;
    public LocalDateTime end;
    public int deposit;
    public int totalUpToNow;
}
