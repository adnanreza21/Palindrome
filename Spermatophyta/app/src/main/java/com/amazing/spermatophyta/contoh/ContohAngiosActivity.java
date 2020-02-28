package com.amazing.spermatophyta.contoh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.spermatophyta.R;

public class ContohAngiosActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView Card1, Card2, Card3, Card4, Card5, Card6, Card7, Card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_angios);
        Card1 = (CardView) findViewById(R.id.card1);
        Card2 = (CardView) findViewById(R.id.card2);
        Card3 = (CardView) findViewById(R.id.card3);
        Card4 = (CardView) findViewById(R.id.card4);
        Card5 = (CardView) findViewById(R.id.card5);
        Card6 = (CardView) findViewById(R.id.card6);
        Card7 = (CardView) findViewById(R.id.card7);
        Card8 = (CardView) findViewById(R.id.card8);


        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);
        Card3.setOnClickListener(this);
        Card4.setOnClickListener(this);
        Card5.setOnClickListener(this);
        Card6.setOnClickListener(this);
        Card7.setOnClickListener(this);
        Card8.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card1:
                i = new Intent(this, AngiosManihotActivity.class);
                startActivity(i);
                break;
            case R.id.card2:
                i = new Intent(this, AngiosEuphoActivity.class);
                startActivity(i);
                break;
            case R.id.card3:
                i = new Intent(this, AngiosCapsiActivity.class);
                startActivity(i);
                break;
            case R.id.card4:
                i = new Intent(this, AngiosSolanumActivity.class);
                startActivity(i);
                break;
            case R.id.card5:
                i = new Intent(this, AngiosAdeniumActivity.class);
                startActivity(i);
                break;
            case R.id.card6:
                i = new Intent(this, AngiosCathaActivity.class);
                startActivity(i);
                break;
            case R.id.card7:
                i = new Intent(this, AngiosAloeActivity.class);
                startActivity(i);
                break;
            case R.id.card8:
                i = new Intent(this, AngiosMusaActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
