package com.example.tourguide;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tourguide.databinding.ActivityContactBinding;

public class ContactActivity extends DrawerBaseActivity {
    ActivityContactBinding activityContactBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityContactBinding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(activityContactBinding.getRoot());
        allocateActivityTitle("Contact us");
    }
}