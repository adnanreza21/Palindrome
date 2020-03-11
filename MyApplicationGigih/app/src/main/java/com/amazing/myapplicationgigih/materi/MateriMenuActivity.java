package com.amazing.myapplicationgigih.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.myapplicationgigih.R;

public class MateriMenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2,button3,button4,button5,button6,button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_menu);
        button1 = (Button) findViewById(R.id.but1);
        button2 = (Button) findViewById(R.id.but2);
        button3 = (Button) findViewById(R.id.but3);
        button4 = (Button) findViewById(R.id.but4);
        button5 = (Button) findViewById(R.id.but5);
        button6 = (Button) findViewById(R.id.but6);
        button7 = (Button) findViewById(R.id.but7);
        button8 = (Button) findViewById(R.id.but8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.but1: i = new Intent(this, Materi1Activity.class); startActivity(i); break;
            case R.id.but2: i = new Intent(this, Materi2Activity.class); startActivity(i); break;
            case R.id.but3: i = new Intent(this, Materi3Activity.class); startActivity(i); break;
            case R.id.but4: i = new Intent(this, Materi4Activity.class); startActivity(i); break;
            case R.id.but5: i = new Intent(this, Materi5Activity.class); startActivity(i); break;
            case R.id.but6: i = new Intent(this, Materi6Activity.class); startActivity(i); break;
            case R.id.but7: i = new Intent(this, Materi7Activity.class); startActivity(i); break;
            case R.id.but8: i = new Intent(this, Materi8Activity.class); startActivity(i); break;
        }
    }
}

