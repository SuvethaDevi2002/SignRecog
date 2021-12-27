package com.example.signlanguageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Book33Activity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_bar_2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.cardHome){
            Intent i = new Intent(Book33Activity.this,MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        if(id == R.id.cardCapture){
            Intent i = new Intent(Book33Activity.this,CaptureActivity.class);
            startActivity(i);
            finish();
            return true;
        }

        if(id == R.id.cardHome){
            Intent i = new Intent(Book33Activity.this,MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        if(id == R.id.cardBook){
            Intent i = new Intent(Book33Activity.this,BookActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book33);
    }
}