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

public class AquaCityQuiz extends AppCompatActivity {

    TextView dolphinText;
    ImageView dolphinQuizImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua_city_quiz);

        Intent aquaQuizIntent = getIntent();

        dolphinQuizImage = findViewById(R.id.dolphin_tangled);
        dolphinText = findViewById(R.id.dolphin_textView);
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
                Intent inventoryIntent = new Intent(this, Inventory.class);
                startActivity(inventoryIntent);
                return true;
            case R.id.hint:
                Toast.makeText(this, "No need for a hint, you can do it!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void collectScissors(View view){
        int numScissors = 1;
        Intent scissorsIntent = new Intent(this, Inventory.class);
        scissorsIntent.putExtra("Scissors", numScissors);
        startActivity(scissorsIntent);

//        dolphinQuizImage.setImageResource(R.drawable.dolphin_set_free);
//        dolphinText.setText(R.string.aqua_puzzle_solved);
    }


}
