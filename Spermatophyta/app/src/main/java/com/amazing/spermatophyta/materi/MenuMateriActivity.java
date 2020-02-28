package com.amazing.spermatophyta.materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.amazing.spermatophyta.R;

public class MenuMateriActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView limamCard,spermatoCard,gymnosCard,angiosCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materi);
        limamCard = (CardView) findViewById(R.id.card1);
        spermatoCard = (CardView) findViewById(R.id.card2);
        gymnosCard = (CardView) findViewById(R.id.card3);
        angiosCard = (CardView) findViewById(R.id.card4);

        limamCard.setOnClickListener(this);
        spermatoCard.setOnClickListener(this);
        gymnosCard.setOnClickListener(this);
        angiosCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, MateriSpermaActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this, MateriGymnoActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this, MateriAngiosActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this, MateriBungaActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
