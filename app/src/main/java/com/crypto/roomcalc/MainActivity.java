package com.crypto.roomcalc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.crypto.roomcalc.Data.CropsDatabase;

public class MainActivity extends AppCompatActivity {

    private CropsDatabase cropsDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cropsDatabase = Room.databaseBuilder(getApplicationContext(),
                CropsDatabase.class, "CropsDB")
                .allowMainThreadQueries()
                .build();
    }
}