package com.example.signlanguageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Book44Activity extends AppCompatActivity {
    androidx.cardview.widget.CardView cardView;
    androidx.cardview.widget.CardView cardView1;
    androidx.cardview.widget.CardView cardView2;
    androidx.cardview.widget.CardView cardView3;
    androidx.cardview.widget.CardView cardView4;
    androidx.cardview.widget.CardView cardView5;

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
            Intent i = new Intent(Book44Activity.this,MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        if(id == R.id.cardCapture){
            Intent i = new Intent(Book44Activity.this,CaptureActivity.class);
            startActivity(i);
            finish();
            return true;
        }

        if(id == R.id.cardHome){
            Intent i = new Intent(Book44Activity.this,MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        if(id == R.id.cardBook){
            Intent i = new Intent(Book44Activity.this,BookActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book44);

        cardView = findViewById(R.id.card1);
        cardView1 = findViewById(R.id.card2);
        cardView2 = findViewById(R.id.card3);
        cardView3 = findViewById(R.id.card4);
        cardView4 = findViewById(R.id.card5);
        cardView5 = findViewById(R.id.card6);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               gotoUrl("https://youtu.be/lYhAAMDQl-Q");
            }
        });
cardView1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://youtu.be/jjvzIgFNY9Q");
    }
});
cardView2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://youtu.be/v1desDduz5M");
    }
});
cardView3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://youtu.be/p0ufyoe0URA");
    }
});
cardView4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://youtu.be/b4E9sSvliEo");
    }
});
cardView5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://youtu.be/Raa0vBXA8OQ");
    }
});
    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}