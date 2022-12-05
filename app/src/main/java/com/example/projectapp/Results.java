package com.example.projectapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Results extends AppCompatActivity {
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_activity);

        this.txtView = findViewById(R.id.messageTextView);

        //getting data from previous activity
        Intent results = getIntent();
        String stressFactor = results.getStringExtra("Stress");
        String fatigueFactor = results.getStringExtra("Fatigue");
        String alcoholFactor = results.getStringExtra("Alcohol");
        String foodFactor = results.getStringExtra("Food");
        String noiseFactor = results.getStringExtra("Noise");
        String physicalFactor = results.getStringExtra("Physical");

        Intent factors = getIntent();
        String lengthOfDaysResult = factors.getStringExtra("Length of days");

        String message = "Possible causes for migraine:\n" + stressFactor +
                "\n" + fatigueFactor +
                "\n" + alcoholFactor +
                "\n" + foodFactor +
                "\n" + noiseFactor +
                "\n" + physicalFactor +
                "\nMigraine lasted for " + lengthOfDaysResult + " days.";
        this.txtView.setText(message);

    }
}


