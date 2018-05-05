package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Inventory extends AppCompatActivity {

    int numberOfScissors;
    int numberOfJunk;
    int numberOfGold;
    int numberOfSandwich;
    int numberOfCompass;
    int numberOfWater;

    TextView scissorsNumber;
    TextView junkNumber;
    TextView goldNumber;
    TextView sandwichNumber;
    TextView compassNumber;
    TextView waterNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        TextView useScissors = findViewById(R.id.use_scissors);
        TextView useJunk = findViewById(R.id.use_junk);
        TextView useGold = findViewById(R.id.use_gold);
        TextView useSandwich = findViewById(R.id.use_sandwich);
        TextView useCompass = findViewById(R.id.use_compass);
        TextView useWater = findViewById(R.id.use_water);

        scissorsNumber = findViewById(R.id.number_of_scissors);
        junkNumber = findViewById(R.id.number_of_junk);
        goldNumber = findViewById(R.id.number_of_gold);
        sandwichNumber = findViewById(R.id.number_of_sandwich);
        compassNumber = findViewById(R.id.number_of_compass);
        waterNumber = findViewById(R.id.number_of_water);

        Intent inventoryIntent = getIntent();

        numberOfScissors = inventoryIntent.getIntExtra("Scissors", 0);
        String textNumberOfScissors =  Integer.toString(numberOfScissors);
        scissorsNumber.setText(textNumberOfScissors);

        numberOfSandwich = inventoryIntent.getIntExtra("Sandwich", 0);
        String textNumberOfSandwich =  Integer.toString(numberOfSandwich);
        sandwichNumber.setText(textNumberOfSandwich);

        numberOfGold = inventoryIntent.getIntExtra("Gold", 0);
        String textNumberOfGold = Integer.toString(numberOfGold);
        goldNumber.setText(textNumberOfGold);
    }

    public void useScissors(View view) {
        if (numberOfScissors != 0) {
            numberOfScissors = numberOfScissors - 1;
            String textNumberOfScissors =  Integer.toString(numberOfScissors);
            scissorsNumber.setText("" + textNumberOfScissors);
            Toast.makeText(this, "You freed the dolphin!", Toast.LENGTH_SHORT).show();
        }
        else{
            return;
        }

        finish();
    }

    public void useJunk(View view) {

        if (numberOfJunk == 0) {
            return;
        }
        numberOfJunk --;
        String textNumberOfJunk =  Integer.toString(numberOfJunk);
        junkNumber.setText("" + textNumberOfJunk);

        Toast.makeText(this, "You used what first appeared to be junk!", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void useGold(View view) {
        if (numberOfGold == 0) {
            return;
        }
        numberOfGold --;
        String textNumberOfGold =  Integer.toString(numberOfGold);
        goldNumber.setText("" + textNumberOfGold);

        Toast.makeText(this, "You gave the octopus your gold!", Toast.LENGTH_SHORT).show();
    }

    public void useSandwich(View view) {

        if (numberOfSandwich == 0) {
            return;
        }
        numberOfSandwich --;
        String textNumberOfSandwich =  Integer.toString(numberOfSandwich);
        sandwichNumber.setText("" + textNumberOfSandwich);

        Toast.makeText(this, "Turns out you just had to give them a sandwich!", Toast.LENGTH_SHORT).show();
    }

    public void useCompass(View view) {

        if (numberOfCompass == 0) {
            return;
        }
        numberOfCompass --;
        String textNumberOfCompass =  Integer.toString(numberOfCompass);
        compassNumber.setText("" + textNumberOfCompass);

        Toast.makeText(this, "The compass appears to be pointed West.", Toast.LENGTH_SHORT).show();
    }

    public void useWater(View view) {

        if (numberOfWater == 0) {
            return;
        }
        numberOfWater --;
        String textNumberOfWater =  Integer.toString(numberOfWater);
        waterNumber.setText("" + textNumberOfWater);

        Toast.makeText(this, "The water got rid of the fire!", Toast.LENGTH_SHORT).show();
    }
}