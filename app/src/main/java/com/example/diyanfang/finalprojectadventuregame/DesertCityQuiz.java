package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DesertCityQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert_city_quiz);

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
                int numGold = 1000;
                Intent inventoryIntent = new Intent(this, Inventory.class);
                inventoryIntent.putExtra("Gold", numGold);
                startActivity(inventoryIntent);
                return true;
            case R.id.hint:
                Toast.makeText(this, "No need for a hint, you can do it!", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void clickNW(View view){

        Toast.makeText(this, "Brilliant! North west is your answer!", Toast.LENGTH_SHORT).show();

    }
}
