package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tourguide.databinding.ActivityHomeBinding;

public class HomeActivity extends DrawerBaseActivity {
  ActivityHomeBinding activityHomeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(activityHomeBinding.getRoot());
        allocateActivityTitle("Home");

    }
}