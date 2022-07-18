package com.crypto.roomcalc;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

//1. create  name of the table
@Entity (tableName = "crops")
public class Crops {

    //3.Add primary key to id;
    @PrimaryKey(autoGenerate = true)
    //2. create  name for each field of the table by @ColumnInfo
    @ColumnInfo(name = "crop_id")
    private long id;

    @ColumnInfo(name = "crop_name")
    private String name;

    @ColumnInfo(name ="n_crop")
    private int nCrop;

    @ColumnInfo(name ="p_crop")
    private int pCrop;

    @ColumnInfo(name ="k_crop")
    private int kCrop;

    //4. Add @Ignore to simple constructor
    @Ignore
    public Crops() {
    }

    public Crops(long id, String name, int nCrop, int pCrop, int kCrop) {
        this.id = id;
        this.name = name;
        this.nCrop = nCrop;
        this.pCrop = pCrop;
        this.kCrop = kCrop;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getnCrop() {
        return nCrop;
    }

    public int getpCrop() {
        return pCrop;
    }

    public int getkCrop() {
        return kCrop;
    }
}
