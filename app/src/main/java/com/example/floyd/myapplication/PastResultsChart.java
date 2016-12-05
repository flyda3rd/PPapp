package com.example.floyd.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class PastResultsChart extends AppCompatActivity {

    LineGraphSeries<DataPoint>series;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_results_chart);


        int y,x;
        x = 0;

        int[]fakepoint =  new int []
                { 60, 60, 65, 67, 75, 80, 90, 100, 100, 95, 95, 100};
        //int hour=0;
        //int mins=0;

        GraphView graph = (GraphView) findViewById(R.id.graphh);
        series = new LineGraphSeries<DataPoint>();
        graph.addSeries(series);

        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(12);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(100);

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setXAxisBoundsManual(true);




        for(int i = 0; i<12; i++){
            //hour = i;
            x = x+1;
            y = fakepoint[i];
            series.appendData(new DataPoint(x,y), true, 12);
        }
        graph.addSeries(series);
    }
}
