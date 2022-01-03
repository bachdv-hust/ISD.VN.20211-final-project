package isd.vn.ecobike.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CardEntity {
    @PrimaryKey
    public int id;
    public String cvvCode;
    public String owner;
    public String cardCode;
    public String dateExpired;
}