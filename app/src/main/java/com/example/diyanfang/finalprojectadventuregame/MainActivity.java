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

    private List<Quiz> quizzes = new ArrayList<>();
    private QuizAdapter quizAdapter;
    private User currentUser;
    public int REQUEST_CODE = 901;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();
//        getLevelUnlock();
//        checkLogin();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //true if adapter changes cannot affect the size of the RecyclerView.
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        quizAdapter = new QuizAdapter(quizzes, this);
        recyclerView.setAdapter(quizAdapter);

    }

    private void initialData() {

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
                return true;
            case R.id.hint:
                Toast.makeText(this, "No need for a hint, you can do it!", Toast.LENGTH_SHORT).show();
                return true;
//            case R.id.login:
//                Intent loginIntent = new Intent(this, Login.class);
//                startActivity(loginIntent);
//                return true;
//            case R.id.add:
//                quizzes.add(getRandomQuiz());
//                quizAdapter.notifyDataSetChanged();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void checkLogin(){
        if( currentUser == null ) {
            Intent intent = new Intent(this, Login.class);
            startActivityForResult(intent, REQUEST_CODE);
        }
        else{
            return;
        }
    }

//    public void getLevelUnlock() {
//
//        ImageView lock = (ImageView) findViewById(R.id.lock);
//        lock.setImageResource(R.drawable.unlock);

//        currentUser = new User("johnny@gmail.com", "1234", 2);
//
//        int num = currentUser.getLevel();
//
//        if (num == 2) {
//            Quiz temp = new Quiz(R.string.gold_city, R.string.about_gold_city, R.drawable.gold_city, true);
//            ImageView lock = (ImageView) findViewById(R.id.lock);
//            lock.setImageResource(R.drawable.unlock);
//            quizzes.set(1, temp);
//        } else if (num == 3) {
//            Quiz temp2 = new Quiz(R.string.flame_city, R.string.about_flame_city, R.drawable.flame_city, true);
//            ImageView lock = (ImageView) findViewById(R.id.lock);
//            lock.setImageResource(R.drawable.unlock);
//            quizzes.set(2, temp2);
//        } else if (num == 4) {
//            Quiz temp3 = new Quiz(R.string.desert_city, R.string.about_desert_city, R.drawable.desert_city, true);
//            ImageView lock = (ImageView) findViewById(R.id.lock);
//            lock.setImageResource(R.drawable.unlock);
//            quizzes.set(3, temp3);
//        } else if (num == 5) {
//            Quiz temp4 = new Quiz(R.string.earth_city, R.string.about_earth_city, R.drawable.earth_snapshot, true);
//            ImageView lock = (ImageView) findViewById(R.id.lock);
//            lock.setImageResource(R.drawable.unlock);
//            quizzes.set(4, temp4);
//        }
//        else{
//            return;
//        }
//    }


}
