package com.example.roll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Burgers extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgers);
        Button buttonM = (Button) findViewById(R.id.M);
        Button buttonDf = (Button) findViewById(R.id.Df);
        Button buttonBt = (Button) findViewById(R.id.Bt);
        Button buttonTch = (Button) findViewById(R.id.Tch);
        Button buttonBack = (Button) findViewById(R.id.back);

        buttonBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(this, activity_main);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onClick(View view) {

    }
}