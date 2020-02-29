package com.amazing.myapplicationbio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView dosenCard,mahasiswaCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

       dosenCard = (CardView) findViewById(R.id.carddosen);
        mahasiswaCard = (CardView) findViewById(R.id.cardmhs);

        dosenCard.setOnClickListener(this);
        mahasiswaCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.carddosen : i = new Intent(this,ProfilDosenActivity.class);startActivity(i);break;
            case R.id.cardmhs : i = new Intent(this,ProfilMhsActivity.class);startActivity(i);break;

            default:break;
        }

    }
}
