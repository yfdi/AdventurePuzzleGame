package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EarthCity extends AppCompatActivity {

    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_city);

        nextButton= findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent earthQuizIntent = new Intent (EarthCity.this, EarthCityQuiz.class);
                startActivity(earthQuizIntent);
            }
        });
    }
}
