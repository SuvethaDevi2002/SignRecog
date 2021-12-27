package com.example.signlanguageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Book11Activity extends AppCompatActivity {

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
            Intent i = new Intent(Book11Activity.this,MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        if(id == R.id.cardCapture){
            Intent i = new Intent(Book11Activity.this,CaptureActivity.class);
            startActivity(i);
            finish();
            return true;
        }

        if(id == R.id.cardHome){
            Intent i = new Intent(Book11Activity.this,MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        if(id == R.id.cardBook){
            Intent i = new Intent(Book11Activity.this,BookActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book11);

    }
}