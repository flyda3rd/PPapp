package com.example.floyd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pastresultss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastresultss);


        Button advanceToExerciselist = (Button) findViewById(R.id.listbutton);
        advanceToExerciselist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next1 = new Intent(Pastresultss.this, ExerciseInfo.class);
                startActivity(next1);
            }
        });

        Button advanceToPastresultss = (Button) findViewById(R.id.pastbutton);
        advanceToPastresultss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next2 = new Intent(Pastresultss.this, PastResultsChart.class);
                startActivity(next2);
            }
        });
    }
}
