package com.example.ex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Next page");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        String itemTitle = item.getTitle().toString();

        if (itemTitle.equals("Next page")){
            Intent si = new Intent(this, secondActivity.class);
            startActivity(si);
        }

        switch (id){
            case R.id.menuGreen:{
                screen.setBackgroundColor(Color.GREEN);
            }
            break;

            case R.id.menuBlue:{
                screen.setBackgroundColor(Color.BLUE);
            }
            break;

            case R.id.menuYellow:{
                screen.setBackgroundColor(Color.YELLOW);
            }
            break;
        }
        return true;
    }
}