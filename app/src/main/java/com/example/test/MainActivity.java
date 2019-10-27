package com.example.test;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int foulssA = 0;
    int foulssB = 0;
    int outssA = 0;
    int outssB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Forgive me for my bad code its my first app ^_^
        final TextView textA = (TextView) findViewById(R.id.scoreA);
        final TextView textB = (TextView) findViewById(R.id.scoreB);
        final TextView foulA = (TextView) findViewById(R.id.foulsA);
        final TextView foulB = (TextView) findViewById(R.id.foulsB);
        final TextView outsA = (TextView) findViewById(R.id.outsA);
        final TextView outsB = (TextView) findViewById(R.id.outsB);
        final Button restButton= (Button) findViewById(R.id.rest);

        Button btA3 = (Button) findViewById(R.id.button22);
        Button btA2 = (Button) findViewById(R.id.button9);
        Button btA1 = (Button) findViewById(R.id.button13);
        Button btb3 = (Button) findViewById(R.id.button8);
        Button btb2 = (Button) findViewById(R.id.button10);
        Button btb1 = (Button) findViewById(R.id.button17);

        //////score Team A//////


        btA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = scoreA + 1;
                textA.setText(String.valueOf(scoreA));
            }
        });
        /// out team A

        btA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outssA = outssA + 1;
                outsA.setText(String.valueOf(outssA));
            }
        });
        // fouls team A

        btA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foulssA = foulssA + 1;
                foulA.setText(String.valueOf(foulssA));
            }
        });
        ////////Team B scores/////
        btb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB = scoreB + 1;
                textB.setText(String.valueOf(scoreB));
            }
        });
        /// team b outs

        btb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outssB = outssB + 1;
                outsB.setText(String.valueOf(outssB));
            }
        });
        /// team b fouls

        btb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foulssB = foulssB + 1;
                foulB.setText(String.valueOf(foulssB));
            }
        });
        ///rest button///
        restButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = 0;
                scoreB = 0;
                textB.setText(String.valueOf(scoreB));
                textA.setText(String.valueOf(scoreA));
                foulA.setText(String.valueOf(scoreB));
                foulB.setText(String.valueOf(scoreA));
                outsA.setText(String.valueOf(scoreB));
                outsB.setText(String.valueOf(scoreA));




            }
        });

    }






}
