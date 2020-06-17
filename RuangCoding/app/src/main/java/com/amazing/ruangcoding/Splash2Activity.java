package com.amazing.ruangcoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.ruangcoding.kuis.MenuQuizActivity;
import com.amazing.ruangcoding.menu.KompetensiActivity;
import com.amazing.ruangcoding.menu.MenuMateriActivity;
import com.amazing.ruangcoding.menu.MenuProfileActivity;
import com.amazing.ruangcoding.menu.VideoActivity;

public class Splash2Activity extends AppCompatActivity  {
    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        button = (Button) findViewById(R.id.mulai);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
    }
    public void openHomeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}