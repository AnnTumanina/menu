package com.example.roll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    LinearLayout LinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout = findViewById(R.id.linearlayout);
    }

    public void onClickBurgers(View view) {
        LinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.burgers));

    }

    public void onClickHot(View view) {
        LinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.hot));
    }

    public void onClickDrinks(View view) {
        LinearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.drinks));
    }
}