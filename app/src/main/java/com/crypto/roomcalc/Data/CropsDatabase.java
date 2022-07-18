package com.crypto.roomcalc.Data;

//1. make this class abstract

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.crypto.roomcalc.Crops;

//2. Add @Database and entities class with version of db
@Database(entities = {Crops.class}, version = 1)

//3. extends from RoomDatabase
public abstract class CropsDatabase extends RoomDatabase {

    //4. Create abstract method with return type CropsDao
    public abstract CropsDAO getCropsDao();
}
