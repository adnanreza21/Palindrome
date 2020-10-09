package com.amazing.myapplicationjawa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.myapplicationjawa.kuis.MenuKuisActivity;
import com.amazing.myapplicationjawa.materi.MenuMateriActivity;
import com.amazing.myapplicationjawa.menu.KapustakaanActivity;
import com.amazing.myapplicationjawa.menu.KomikActivity;
import com.amazing.myapplicationjawa.menu.KompetensiActivity;
import com.amazing.myapplicationjawa.menu.KuisActivity;
import com.amazing.myapplicationjawa.menu.MateriActivity;
import com.amazing.myapplicationjawa.menu.PitedahActivity;
import com.amazing.myapplicationjawa.menu.ProfilActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView pitedahCard, komikCard, kapustakaanCard, kuisCard, profilCard, materiCard, kompetensiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pitedahCard = (CardView) findViewById(R.id.card1);
        kompetensiCard = (CardView) findViewById(R.id.card2);
        materiCard = (CardView) findViewById(R.id.card3);
        komikCard = (CardView) findViewById(R.id.card4);
        kuisCard = (CardView) findViewById(R.id.card5);
        kapustakaanCard = (CardView) findViewById(R.id.card6);
        profilCard = (CardView) findViewById(R.id.card7);


        pitedahCard.setOnClickListener(this);
        kompetensiCard.setOnClickListener(this);
        materiCard.setOnClickListener(this);
        komikCard.setOnClickListener(this);
        kuisCard.setOnClickListener(this);
        kapustakaanCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card1: i = new Intent(this, PitedahActivity.class); startActivity(i); break;
            case R.id.card2: i = new Intent(this, KompetensiActivity.class); startActivity(i); break;
            case R.id.card3: i = new Intent(this, MenuMateriActivity.class); startActivity(i); break;
            case R.id.card4: i = new Intent(this, KomikActivity.class); startActivity(i); break;
            case R.id.card5: i = new Intent(this, MenuKuisActivity.class); startActivity(i); break;
            case R.id.card6: i = new Intent(this, KapustakaanActivity.class); startActivity(i); break;
            case R.id.card7: i = new Intent(this, ProfilActivity.class); startActivity(i); break;
            default:
                break;
        }
    }
}
