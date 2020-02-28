package com.amazing.spermatophyta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.spermatophyta.materi.MlimaActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView bookCard,silabusCard,quizCard,videoCard,profilCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookCard = (CardView) findViewById(R.id.card2);
        silabusCard = (CardView) findViewById(R.id.card1);
        quizCard = (CardView) findViewById(R.id.card3);
        videoCard = (CardView) findViewById(R.id.card4);
        profilCard = (CardView) findViewById(R.id.card5);

        bookCard.setOnClickListener(this);
        silabusCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        videoCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card2 : i = new Intent(this, MlimaActivity.class);startActivity(i);break;
            case R.id.card1 : i = new Intent(this,SilabusActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this,QuizActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this,VideoActivity.class);startActivity(i);break;
            case R.id.card5 : i = new Intent(this,ProfileActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
