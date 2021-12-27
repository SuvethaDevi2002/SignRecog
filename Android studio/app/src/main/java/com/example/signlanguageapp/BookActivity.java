package com.example.signlanguageapp;

import static com.example.signlanguageapp.R.menu.app_bar_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class BookActivity extends AppCompatActivity {


GridLayout mainGrid;
@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

mainGrid=(GridLayout) findViewById(R.id.mainGrid);
setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
    for(int i=0;i<mainGrid.getChildCount();i++){
        CardView cardView = (CardView) mainGrid.getChildAt(i);
        final int final1=i;
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(final1 ==0){
                    Intent intent=new Intent(BookActivity.this,Book11Activity.class);
                    startActivity(intent);
                }
                else if(final1 ==1){
                    Intent intent=new Intent(BookActivity.this,Book22Activity.class);
                    startActivity(intent);
                }
                else if(final1 ==2){
                    Intent intent=new Intent(BookActivity.this,Book33Activity.class);
                    startActivity(intent);
                }
                else if(final1 ==3){
                    Intent intent=new Intent(BookActivity.this,Book44Activity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(BookActivity.this, "not items", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.app_bar_menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.cardHome){
            Intent i = new Intent(BookActivity.this,MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        if(id == R.id.cardCapture){
            Intent i = new Intent(BookActivity.this,CaptureActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }


}

