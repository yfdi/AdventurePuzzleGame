package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by mclark on 5/4/18.
 */

public class GoldCityQuiz extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_city_quiz);

        Intent goldQuizIntent = getIntent();
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
                Intent inventoryIntent = new Intent(this, Inventory.class);
                inventoryIntent.putExtra("Water", numWater);
                startActivity(inventoryIntent);
                return true;
            case R.id.hint:
                Toast.makeText(this, "No need for a hint, you can do it!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void choiceA(View view){
        Toast.makeText(this, "Nope try again, look at the choices closely.", Toast.LENGTH_SHORT).show();
    }
    public void choiceB(View view){
        Toast.makeText(this, "That's not correct.", Toast.LENGTH_SHORT).show();
    }
    public void choiceC(View view){
        Toast.makeText(this, "Close, but still not right.", Toast.LENGTH_SHORT).show();
    }
    public void choiceD(View view){
        Toast.makeText(this, "Yes, you solved it! The people gave you 1,000 gold!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Inventory.class);
        intent.putExtra("Gold", 1000);
        intent.putExtra("Water",1);
        startActivityForResult(intent, 9001);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 9001  && resultCode  == RESULT_OK) {
            finish();
        }
    }

}