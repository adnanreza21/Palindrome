package com.amazing.myapplicationgalih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView bookCard,silabusCard,quizCard,profilCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookCard = (CardView) findViewById(R.id.card1);
        silabusCard = (CardView) findViewById(R.id.card2);
        quizCard = (CardView) findViewById(R.id.card3);
        profilCard = (CardView) findViewById(R.id.card4);

        bookCard.setOnClickListener(this);
        silabusCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, KompetensiActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this,MenuMateriActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this,QuizActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this,ProfileActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
