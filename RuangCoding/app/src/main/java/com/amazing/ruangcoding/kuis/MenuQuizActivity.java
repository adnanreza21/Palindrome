package com.amazing.ruangcoding.kuis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.ruangcoding.R;
import com.amazing.ruangcoding.menu.KompetensiActivity;
import com.amazing.ruangcoding.menu.MenuMateriActivity;
import com.amazing.ruangcoding.menu.MenuProfileActivity;
import com.amazing.ruangcoding.menu.QuizActivity;
import com.amazing.ruangcoding.menu.VideoActivity;

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
            case R.id.card1 : i = new Intent(this, QuizActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, ModulActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
