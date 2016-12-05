package com.example.floyd.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class Results extends AppCompatActivity {

    LineGraphSeries<DataPoint>series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int y,x;
        x = 0;

        int[]fakepoint =  new int []
                { 100, 100, 90, 80, 70, 70, 60, 70, 30, 30, 10, 70, 70, 90, 60, 60, 30, 60, 90, 90, 100, 100, 90, 90, 70, 70, 50, 60, 90, 100, 10};
        //int hour=0;
        //int mins=0;

        GraphView graph = (GraphView) findViewById(R.id.graph);
        series = new LineGraphSeries<DataPoint>();
        graph.addSeries(series);

        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(60);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(100);

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setXAxisBoundsManual(true);




        for(int i = 0; i<30; i++){
            //hour = i;
            x = x+2;
            y = fakepoint[i];
                series.appendData(new DataPoint(x,y), true, 30);
        }
        graph.addSeries(series);


        Button advanceToInfo = (Button) findViewById(R.id.moreinfo);
        advanceToInfo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random pick = new Random();
                int select = pick.nextInt(4)+1;
                Class activity = null;

                switch (select) {
                    case 1:
                        activity = Torsotwist.class;
                        break;
                    case 2:
                        activity = BigHug.class;
                        break;
                    case 3:
                        activity = ToeTouch.class;
                        break;
                    default:
                        activity = LegHug.class;
                        break;
                }
                    Intent next1 = new Intent(Results.this, activity);
                    startActivity(next1);

            }


        });
    }

}
