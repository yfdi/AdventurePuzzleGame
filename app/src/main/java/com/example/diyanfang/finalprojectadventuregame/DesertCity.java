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

    ImageView waterCollect;
    TextView cactusSpeech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert_city);

        waterCollect = findViewById(R.id.transparent_image);
        cactusSpeech = findViewById(R.id.speech_bubble_text);
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

    public void collectScissors(View view){
        int numScissors = 1;
        Intent scissorsIntent = new Intent(this, Inventory.class);
        scissorsIntent.putExtra("Scissors", numScissors);
        startActivity(scissorsIntent);

        waterCollect.setImageResource(R.drawable.dolphin_set_free);
        cactusSpeech.setText(R.string.cactus_speech);
    }
}
