package com.covid.ruangcoding.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.covid.ruangcoding.R;
import com.covid.ruangcoding.materi.Materi1Activity;
import com.covid.ruangcoding.materi.Materi2Activity;
import com.covid.ruangcoding.materi.Materi3Activity;

public class MenuMateriActivity extends AppCompatActivity  implements View.OnClickListener {
    private CardView materi1Card,materi2Card,materi3Card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materi);
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
            case R.id.card1 : i = new Intent(this, Materi1Activity.class);startActivity(i);break;
            case R.id.card2: i = new Intent(this, Materi2Activity.class);startActivity(i);break;
            case R.id.card3: i = new Intent(this, Materi3Activity.class);startActivity(i);break;

            default:break;
        }
    }
}
