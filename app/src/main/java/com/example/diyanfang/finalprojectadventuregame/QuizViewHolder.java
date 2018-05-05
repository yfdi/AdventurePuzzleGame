package com.example.diyanfang.finalprojectadventuregame;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Created by diyanfang on 4/22/18.
 */

public class QuizViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView quizImage;
    public TextView quizName;
    public TextView aboutThisCity;
//    public ImageView lock;

    public boolean isQuizFinished;
    private Context context;

    public QuizViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        quizImage = (ImageView) itemView.findViewById(R.id.quiz_image);
        quizName = (TextView) itemView.findViewById(R.id.quiz_name);
        aboutThisCity = (TextView) itemView.findViewById(R.id.about_this_city);

//        lock = itemView.findViewById(R.id.lock);

        this.context = context;

    }

    public void bind(final Quiz quiz) {

        quizName.setText(quiz.cityName);
        aboutThisCity.setText(quiz.description);
        quizImage.setImageResource(quiz.photoId);
        //add the value of .isFinished to the ViewHolder
        isQuizFinished = quiz.isFinished();

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(context, quizName.getText(),Toast.LENGTH_SHORT).show();
                int messageId = 0;
                //show the finished message
                if (isQuizFinished) {
                    messageId = R.string.quiz_finished_toast;
                } else {
                    messageId = R.string.quiz_unfinished_toast;
                }
                Toast.makeText(context, messageId, Toast.LENGTH_SHORT).show();
            }
        });

        quizImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                enterCity();
//                if (quizName.getText().toString().equalsIgnoreCase("aqua city")){
//                    Quiz q = new Quiz(quiz.cityName, quiz.description, quiz.photoId, quiz.isFinished());
//                    Intent quizIntent = new Intent(context, AquaCity.class);
//                    quizIntent.putExtra(Keys.QUIZ, q);
//                    context.startActivity(quizIntent);
//                }
            }
        });

        quizName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterCity();
            }
        });


//        lock.setVisibility(View.INVISIBLE);
    }

    public void enterCity(){

        if (quizName.getText().toString().equalsIgnoreCase("aqua city")){
            Intent quizIntent = new Intent(context, AquaCity.class);
            context.startActivity(quizIntent);
        } if (quizName.getText().toString().equalsIgnoreCase("gold city")){
            Intent quizIntent = new Intent(context, GoldCity.class);
            context.startActivity(quizIntent);
        }

    }

}
