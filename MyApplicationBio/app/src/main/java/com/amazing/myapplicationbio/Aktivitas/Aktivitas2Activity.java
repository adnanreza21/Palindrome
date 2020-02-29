package com.amazing.myapplicationbio.Aktivitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazing.myapplicationbio.R;

public class Aktivitas2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivitas2);
        btnnext = (Button) findViewById(R.id.btnlanjut);

        btnnext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.btnlanjut:
                i = new Intent(this, Aktivitas3Activity.class);
                startActivity(i);
                break;
        }
    }
}


