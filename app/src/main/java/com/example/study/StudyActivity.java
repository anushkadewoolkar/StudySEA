package com.example.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
    }

    public void math (View v) {
        Intent intent = new Intent(StudyActivity.this, StudyActivity.class);
        startActivity(intent);
    }

    public void science (View v) {
        Intent intent = new Intent(StudyActivity.this, StudyActivity.class);
        startActivity(intent);
    }

    public void english (View v) {
        Intent intent = new Intent(StudyActivity.this, StudyActivity.class);
        startActivity(intent);
    }

    public void history (View v) {
        Intent intent = new Intent(StudyActivity.this, StudyActivity.class);
        startActivity(intent);
    }
}

