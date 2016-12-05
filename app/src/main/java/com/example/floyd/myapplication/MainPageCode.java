package com.example.floyd.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPageCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page_layout);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"SansPosterBold.ttf");
        TextView myTypeview = (TextView) findViewById(R.id.textView);
        myTypeview.setTypeface(myTypeface);

        Button advanceToResults = (Button) findViewById(R.id.Resultsbutton);
        advanceToResults.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next1 = new Intent(MainPageCode.this, Results.class);
                startActivity(next1);
            }
        });

        Button advanceToPastResults = (Button) findViewById(R.id.pastresults);
        advanceToPastResults.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next2 = new Intent(MainPageCode.this, Pastresultss.class);
                startActivity(next2);
            }
        });


        Button advanceToSettings = (Button) findViewById(R.id.setting);
        advanceToSettings.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent next3 = new Intent(MainPageCode.this, Settings.class);
                startActivity(next3);
            }
        });
    }

}
