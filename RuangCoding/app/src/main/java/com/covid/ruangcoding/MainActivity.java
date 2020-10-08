package com.covid.ruangcoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.covid.ruangcoding.kuis.MenuQuizActivity;
import com.covid.ruangcoding.menu.KompetensiActivity;
import com.covid.ruangcoding.menu.MenuMateriActivity;
import com.covid.ruangcoding.menu.MenuProfileActivity;
import com.covid.ruangcoding.menu.VideoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView kikdCard,materiCard,quizCard,videoCard,profilCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       kikdCard = (CardView) findViewById(R.id.card1);
        materiCard = (CardView) findViewById(R.id.card2);
       videoCard = (CardView) findViewById(R.id.card3);
        quizCard = (CardView) findViewById(R.id.card4);
        profilCard = (CardView) findViewById(R.id.card5);


        kikdCard.setOnClickListener(this);
        materiCard.setOnClickListener(this);
        videoCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, KompetensiActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, MenuMateriActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this, VideoActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this, MenuQuizActivity.class);startActivity(i);break;
            case R.id.card5 : i = new Intent(this,MenuProfileActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
