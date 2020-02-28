package com.amazing.spermatophyta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.spermatophyta.silabus.IndikatorActivity;
import com.amazing.spermatophyta.silabus.KompetensiActivity;
import com.amazing.spermatophyta.silabus.TujuanActivity;

public class SilabusActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView kompCard,indikatorCard,tujuanCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silabus);
        kompCard = (CardView) findViewById(R.id.card1);
        indikatorCard = (CardView) findViewById(R.id.card2);
        tujuanCard = (CardView) findViewById(R.id.card3);

        kompCard.setOnClickListener(this);
        indikatorCard.setOnClickListener(this);
        tujuanCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, KompetensiActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this, IndikatorActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this, TujuanActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
