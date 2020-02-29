package com.amazing.myapplicationbio.Organ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.amazing.myapplicationbio.R;

public class HomeOrganActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2, button3, button4, button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_organ);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){

            case R.id.btn1 : i = new Intent(this, MulutActivity.class);startActivity(i);break;
            case R.id.btn2 : i = new Intent(this, KerongkonanActivity.class);startActivity(i);break;
            case R.id.btn3 : i = new Intent(this, LambungActivity.class);startActivity(i);break;
            case R.id.btn4 : i = new Intent(this, UsusActivity.class);startActivity(i);break;
            case R.id.btn5 : i = new Intent(this, AnusActivity.class);startActivity(i);break;

            default:break;
        }
    }
}