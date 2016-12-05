package com.example.floyd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExerciseInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_info);



        Button advanceToTorsoTwist = (Button) findViewById(R.id.torsotwistbutton);
        advanceToTorsoTwist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next1 = new Intent(ExerciseInfo.this, Torsotwist.class);
                startActivity(next1);
            }
        });


        Button advanceToBigHug = (Button) findViewById(R.id.bighugbutton);
        advanceToBigHug.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next2 = new Intent(ExerciseInfo.this, BigHug.class);
                startActivity(next2);
            }
        });


        Button advanceToToeTouch = (Button) findViewById(R.id.toetouchbutton);
        advanceToToeTouch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next3 = new Intent(ExerciseInfo.this, ToeTouch.class);
                startActivity(next3);
            }
        });




        Button advanceToLegHug = (Button) findViewById(R.id.leghugbutton);
        advanceToLegHug.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next4 = new Intent(ExerciseInfo.this, LegHug.class);
                startActivity(next4);
            }
        });
    }
}
