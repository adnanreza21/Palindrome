package com.amazing.myapplicationbio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.myapplicationbio.Aktivitas.Aktivitas1Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bookCard,kikdCard,quizCard,videoCard,profilCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookCard = (CardView) findViewById(R.id.cardmat);
        kikdCard = (CardView) findViewById(R.id.cardkd);
        quizCard = (CardView) findViewById(R.id.cardkuis);
        videoCard = (CardView) findViewById(R.id.cardvideo);
        profilCard = (CardView) findViewById(R.id.cardprofil);

        bookCard.setOnClickListener(this);
        kikdCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        videoCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.cardmat : i = new Intent(this, Aktivitas1Activity.class);startActivity(i);break;
            case R.id.cardkd : i = new Intent(this,KDActivity.class);startActivity(i);break;
            case R.id.cardkuis : i = new Intent(this,QuizActivity.class);startActivity(i);break;
            case R.id.cardvideo : i = new Intent(this,VideoActivity.class);startActivity(i);break;
            case R.id.cardprofil : i = new Intent(this,ProfilActivity.class);startActivity(i);break;
            default:break;
        }

    }
}
