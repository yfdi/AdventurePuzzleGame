package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Inventory extends AppCompatActivity {

    int numberOfScissors=0;
    int numberOfJunk=0 ;
    int numberOfGold=0;
    int numberOfSandwich=0;
    int numberOfCompass=0;
    int numberOfWater=0;

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

        Intent inventoryIntent = getIntent();

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

//        numberOfScissors = inventoryIntent.getIntExtra("Scissors", 1);
//        scissorsNumber.setText(numberOfScissors);

    }

    public void scissorsClick(View view) {
        if (numberOfScissors != 0) {
            numberOfScissors = numberOfScissors - 1;
            scissorsNumber.setText("" + numberOfScissors);
            Toast.makeText(this, "You freed the dolphin!", Toast.LENGTH_SHORT).show();
        }
        else{
            return;
        }
    }

    public void junkClick(View view) {

        if (numberOfJunk == 0) {
            return;
        }
        numberOfJunk --;
        junkNumber.setText("" + numberOfJunk);

        Toast.makeText(this, "You used what first appeared to be junk!", Toast.LENGTH_SHORT).show();
    }

    public void goldClick(View view) {
        if (numberOfGold == 0) {
            return;
        }
        numberOfGold --;
        goldNumber.setText("" + numberOfGold);

        Toast.makeText(this, "You gave the otter your gold!", Toast.LENGTH_SHORT).show();
    }

    public void sandwichClick(View view) {

        if (numberOfSandwich == 0) {
            return;
        }
        numberOfSandwich --;
        sandwichNumber.setText("" + numberOfSandwich);

        Toast.makeText(this, "Turns out you just had to give them a sandwich!", Toast.LENGTH_SHORT).show();
    }

    public void compassClick(View view) {

        if (numberOfCompass == 0) {
            return;
        }
        numberOfCompass --;
        compassNumber.setText("" + numberOfCompass);

        Toast.makeText(this, "The compass appears to be pointed West.", Toast.LENGTH_SHORT).show();
    }

    public void waterClick(View view) {

        if (numberOfWater == 0) {
            return;
        }
        numberOfWater --;
        waterNumber.setText("" + numberOfWater);

        Toast.makeText(this, "The water got rid of the fire!", Toast.LENGTH_SHORT).show();
    }
}
