package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DesertCity extends AppCompatActivity {

    ImageView compass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert_city);

        compass = findViewById(R.id.compass);
    }

    public void collectCompass(View view){
        int numCompass = 1;
        int numGold = 1000;
        Intent collectCompassIntent = new Intent(this, Inventory.class);
        collectCompassIntent.putExtra("Compass", numCompass);
        collectCompassIntent.putExtra("Gold", numGold);
        startActivity(collectCompassIntent);
    }

}
