package com.covid.ruangcoding.kuis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.covid.ruangcoding.R;
import com.covid.ruangcoding.menu.QuizActivity;

public class MenuQuizActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView kikdCard,materiCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quiz);
        kikdCard = (CardView) findViewById(R.id.card1);
        materiCard = (CardView) findViewById(R.id.card2);


        kikdCard.setOnClickListener(this);
        materiCard.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, ResultQuizActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, ModulActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
