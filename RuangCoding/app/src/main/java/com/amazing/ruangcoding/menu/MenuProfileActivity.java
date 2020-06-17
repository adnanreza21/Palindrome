package com.amazing.ruangcoding.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.ruangcoding.R;
import com.amazing.ruangcoding.materi.Materi1Activity;
import com.amazing.ruangcoding.materi.Materi2Activity;
import com.amazing.ruangcoding.materi.Materi3Activity;
import com.amazing.ruangcoding.profil.ProfilDsnActivity;
import com.amazing.ruangcoding.profil.ProfilMediaActivity;
import com.amazing.ruangcoding.profil.ProfilMhsActivity;

public class MenuProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView materi1Card,materi2Card,materi3Card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_profile);
        materi1Card = (CardView) findViewById(R.id.card1);
        materi2Card = (CardView) findViewById(R.id.card2);
        materi3Card = (CardView) findViewById(R.id.card3);

        materi1Card.setOnClickListener(this);
        materi2Card.setOnClickListener(this);
        materi3Card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, ProfilMhsActivity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, ProfilDsnActivity.class);startActivity(i);break;
            case R.id.card3: i = new Intent(this, ProfilMediaActivity.class);startActivity(i);break;

            default:break;
        }
    }
}
