package com.example.hyeminj.syolo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class culture_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_list);

        ViewGroup musical = (ViewGroup)findViewById(R.id.frameLayout4);
        musical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),musical_list.class);
                startActivity(intent);
            }
        });
        ViewGroup festival = (ViewGroup)findViewById(R.id.frameLayout3);
        festival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),festival_list.class);
                startActivity(intent);
            }
        });
        ViewGroup play = (ViewGroup)findViewById(R.id.frameLayout2);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),play_list.class);
                startActivity(intent);
            }
        });
        ViewGroup gallery = (ViewGroup)findViewById(R.id.frameLayout);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),gallery_list.class);
                startActivity(intent);
            }
        });
        ViewGroup etc = (ViewGroup)findViewById(R.id.frameLayout5);
        etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),etc_list.class);
                startActivity(intent);
            }
        });

    }
}
