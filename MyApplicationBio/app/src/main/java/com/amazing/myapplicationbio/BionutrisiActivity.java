package com.amazing.myapplicationbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.myapplicationbio.Organ.AnusActivity;
import com.amazing.myapplicationbio.Organ.KerongkonanActivity;
import com.amazing.myapplicationbio.Organ.LambungActivity;
import com.amazing.myapplicationbio.Organ.MulutActivity;
import com.amazing.myapplicationbio.Organ.UsusActivity;
import com.amazing.myapplicationbio.Zat.AirActivity;
import com.amazing.myapplicationbio.Zat.AsamActivity;
import com.amazing.myapplicationbio.Zat.KarboActivity;
import com.amazing.myapplicationbio.Zat.LemakActivity;
import com.amazing.myapplicationbio.Zat.MineralActivity;
import com.amazing.myapplicationbio.Zat.ProteinActivity;
import com.amazing.myapplicationbio.Zat.VitaminActivity;

public class BionutrisiActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button1, button2, button3, button4, button5, button6, button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bionutrisi);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){

            case R.id.btn1 : i = new Intent(this, KarboActivity.class);startActivity(i);break;
            case R.id.btn2 : i = new Intent(this, ProteinActivity.class);startActivity(i);break;
            case R.id.btn3 : i = new Intent(this, LemakActivity.class);startActivity(i);break;
            case R.id.btn4 : i = new Intent(this, AsamActivity.class);startActivity(i);break;
            case R.id.btn5 : i = new Intent(this, MineralActivity.class);startActivity(i);break;
            case R.id.btn6 : i = new Intent(this, VitaminActivity.class);startActivity(i);break;
            case R.id.btn7 : i = new Intent(this, AirActivity.class);startActivity(i);break;

            default:break;
        }
    }
}