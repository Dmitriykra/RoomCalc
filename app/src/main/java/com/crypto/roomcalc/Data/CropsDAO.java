package com.crypto.roomcalc.Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.crypto.roomcalc.Crops;

import java.util.List;

//1. Add @Dao
@Dao
public interface CropsDAO {

    //2. Insert data in table
    @Insert
    public long addCrops(Crops crops);

    @Update
    public void updateCrop(Crops crops);

    @Delete
    public void deleteCrop(Crops crops);

    //3. Get all data from table
    @Query("select * from crops")
    public List<Crops> getAllCrops();

    //4. Get one crop by id
    @Query("select * from crops where crop_id ==:cropId ")
    public Crops getCropById(long cropId);

    //5. Get one crop by name
    @Query("select * from crops where crop_name ==:cropName ")
    public Crops getCropByname(long cropName);
}
