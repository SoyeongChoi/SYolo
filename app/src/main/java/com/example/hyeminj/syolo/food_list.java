package com.example.hyeminj.syolo;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class food_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        @SuppressLint("ResourceType") Drawable alpha = ((ImageView)findViewById(R.drawable.food)).getBackground();
        alpha.setAlpha(50);
    }
}
