package com.amazing.myapplicationbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.myapplicationbio.Organ.HomeOrganActivity;

public class HomeMateriActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_materi);
        button1 = (Button) findViewById(R.id.pilihana);
        button2 = (Button) findViewById(R.id.pilihanb);
        button3 = (Button) findViewById(R.id.pilihanc);
        button4 = (Button) findViewById(R.id.pilihand);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){

            case R.id.pilihana : i = new Intent(this, HomeOrganActivity.class);startActivity(i);break;
            case R.id.pilihanb : i = new Intent(this,ProsesSistemActivity.class);startActivity(i);break;
            case R.id.pilihanc : i = new Intent(this,BionutrisiActivity.class);startActivity(i);break;
            case R.id.pilihand : i = new Intent(this,GangguanActivity.class);startActivity(i);break;

            default:break;
        }
    }
}