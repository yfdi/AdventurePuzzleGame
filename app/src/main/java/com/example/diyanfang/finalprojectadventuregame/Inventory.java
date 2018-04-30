package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Inventory extends AppCompatActivity {

    TextView useScissors;
    TextView useJunk;
    TextView useGold;
    TextView useSandwich;
    TextView useCompass;
    TextView useWater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        Intent inventoryIntent = getIntent();

        useScissors = findViewById(R.id.use_scissors);
        useJunk = findViewById(R.id.use_junk);
        useGold = findViewById(R.id.use_gold);
        useSandwich = findViewById(R.id.use_sandwich);
        useCompass = findViewById(R.id.use_compass);
        useWater = findViewById(R.id.use_water);
    }


    public void useScissors(View view) {
        Toast.makeText(this, "You freed the dolphin!", Toast.LENGTH_SHORT).show();
    }

    public void useJunk(View view) {
        Toast.makeText(this, "You used what first appeared to be junk!", Toast.LENGTH_SHORT).show();
    }

    public void useGold(View view) {
        Toast.makeText(this, "You gave the otter your gold!", Toast.LENGTH_SHORT).show();
    }

    public void useSandwich(View view) {
        Toast.makeText(this, "Turns out you just had to give them a sandwich!", Toast.LENGTH_SHORT).show();
    }

    public void useCompass(View view) {
        Toast.makeText(this, "The compass appears to be pointed West.", Toast.LENGTH_SHORT).show();
    }

    public void useWater(View view) {
        Toast.makeText(this, "The water got rid of the fire!", Toast.LENGTH_SHORT).show();
    }
}
