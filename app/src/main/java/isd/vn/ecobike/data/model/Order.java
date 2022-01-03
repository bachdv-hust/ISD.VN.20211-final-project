package isd.vn.ecobike.data.model;

import java.time.LocalDateTime;
import isd.vn.ecobike.data.entity.BikeEntity;

public class Order {
    public int id;
    public BikeEntity rentedBike;
    public LocalDateTime start;
    public LocalDateTime end;
    public int deposit;
    public int totalUpToNow;
}
