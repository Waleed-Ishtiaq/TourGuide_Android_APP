package com.example.tourguide;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tourguide.databinding.ActivityDashboardBinding;

public class DashboardActivity extends DrawerBaseActivity {

    ActivityDashboardBinding activityDashboardBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDashboardBinding= ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(activityDashboardBinding.getRoot());
    }
}