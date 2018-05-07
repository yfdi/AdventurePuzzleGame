package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class EarthCityQuiz extends AppCompatActivity {

    ImageView octopus;
    ImageView fox;
    ImageView goldfish;
    ImageView rhinoceros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_city_quiz);

        octopus = findViewById(R.id.octopus);
        fox = findViewById(R.id.fox);
        goldfish = findViewById(R.id.goldfish);
        rhinoceros = findViewById(R.id.rhinoceros);
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
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void rhinoceros(View view){
        Toast.makeText(this, "Nope try again, look at the choices closely.", Toast.LENGTH_SHORT).show();
    }
    public void fox(View view){
        Toast.makeText(this, "That's not correct.", Toast.LENGTH_SHORT).show();
    }
    public void goldfish(View view){
        Toast.makeText(this, "Close, but still not right.", Toast.LENGTH_SHORT).show();
    }
    public void  octopus(View view){
        Toast.makeText(this, "Awesome,The scrambled word is OCTOPUS! " +
                "\nIt turns out that there is an octopus lives here that is the source of pollution.", Toast.LENGTH_LONG).show();
    }
}
