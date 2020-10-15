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

public class secondActivity extends AppCompatActivity {

    LinearLayout screen;
    TextView pageIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        screen = findViewById(R.id.screen);
        pageIndex = findViewById(R.id.pageIndex);

        pageIndex.setText(R.string.you_are_in_page_2);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Red");
        menu.add("Previous page");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        String itemTitle = item.getTitle().toString();

        if (itemTitle.equals("Previous page")){
            finish();
        }
        else if (itemTitle.equals("Red")){
            screen.setBackgroundColor(Color.RED);
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
