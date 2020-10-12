package com.example.tasknews.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tasknews.R;
import com.example.tasknews.view.GalaryActivity;
import com.example.tasknews.view.MainActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newData(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void camera(View view) {
        Intent intent = new Intent(this, GalaryActivity.class);
        startActivity(intent);
    }
}