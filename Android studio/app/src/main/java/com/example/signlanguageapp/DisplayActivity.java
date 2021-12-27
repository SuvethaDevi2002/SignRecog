package com.example.signlanguageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        androidx.cardview.widget.CardView cardBook = findViewById(R.id.cardBook);
        androidx.cardview.widget.CardView cardHome = findViewById(R.id.cardHome);
        cardHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent MainActivityIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivityIntent);
            }
        });
        cardBook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent BookActivityIntent = new Intent(getApplicationContext(), BookActivity.class);
                startActivity(BookActivityIntent);
            }
        });
    }
}