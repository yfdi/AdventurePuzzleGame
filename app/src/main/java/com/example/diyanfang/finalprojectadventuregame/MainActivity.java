package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Quiz> quizzes;
    ArrayList<InventoryList> inventoryList = new ArrayList<>();
    private QuizAdapter quizAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //true if adapter changes cannot affect the size of the RecyclerView.
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        quizAdapter = new QuizAdapter(quizzes, this);
        recyclerView.setAdapter(quizAdapter);
    }

    private void initialData() {
        quizzes = new ArrayList<>();

        quizzes.add(new Quiz(R.string.aqua_city, R.string.about_aqua_city, R.drawable.aqua_city, false));
        quizzes.add(new Quiz(R.string.gold_city, R.string.about_gold_city, R.drawable.gold_city, false));
        quizzes.add(new Quiz(R.string.flame_city, R.string.about_flame_city, R.drawable.flame_city, false));
        quizzes.add(new Quiz(R.string.desert_city, R.string.about_desert_city, R.drawable.desert_city, false));
        quizzes.add(new Quiz(R.string.earth_city, R.string.about_earth_city, R.drawable.earth_snapshot, false));
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
            case R.id.hint:
                Toast.makeText(this, "No need for a hint, you can do it!", Toast.LENGTH_SHORT).show();
//            case R.id.add:
//                quizzes.add(getRandomQuiz());
//                quizAdapter.notifyDataSetChanged();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
