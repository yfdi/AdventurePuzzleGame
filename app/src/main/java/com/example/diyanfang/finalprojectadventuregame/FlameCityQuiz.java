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

public class FlameCityQuiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flame_city_quiz);

        getIntent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main, menu)
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.inventory:
                int numWater = 1;
                int numGold = 1000;
                Intent inventoryIntent = new Intent(this, Inventory.class);
                inventoryIntent.putExtra("Gold", numGold);
                inventoryIntent.putExtra("Water", numWater);
                startActivity(inventoryIntent);
                return true;
            case R.id.hint:
                Intent hintIntent = new Intent(this, Hint.class);
                startActivity(hintIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
