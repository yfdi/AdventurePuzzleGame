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


    public TextView question;
    public String text;
    public ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flame_city_quiz);

        getIntent();

        question = (TextView) findViewById(R.id.question);
        text = question.toString();
        image = (ImageView) findViewById(R.id.waterBottle);
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
                int numSandwich = 1;
                Intent inventoryIntent = new Intent(this, Inventory.class);
                inventoryIntent.putExtra("Gold", numGold);
                inventoryIntent.putExtra("Sandwich", numSandwich);
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

    public void gearClick(View view){
        Toast.makeText(this, "How would a gear help?", Toast.LENGTH_SHORT).show();
    }
    public void waterClick(View view){
        question.setText(R.string.flame_city_compass);
        image.setImageResource(R.drawable.compass);
    }
    public void rightAnswer(View view){
        Toast.makeText(this, "Looks like the right direction!", Toast.LENGTH_LONG).show();
    }
    public void wrongAnswer(View view){
        Toast.makeText(this, "That way looks to dangerous to be correct", Toast.LENGTH_SHORT).show();
    }
}
