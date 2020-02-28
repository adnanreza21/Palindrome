package com.amazing.spermatophyta.contoh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.amazing.spermatophyta.R;


public class ContohGymnoActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView bookCard,silabusCard,quizCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_gymno);
        bookCard = (CardView) findViewById(R.id.card1);
        silabusCard = (CardView) findViewById(R.id.card2);
        quizCard = (CardView) findViewById(R.id.card3);

        bookCard.setOnClickListener(this);
        silabusCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, ContohCycasActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this, ContohPinusActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this, ContohGnetumActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
