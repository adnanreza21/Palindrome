package com.amazing.myapplicationbio.Aktivitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.amazing.myapplicationbio.R;

public class Aktivitas1Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivitas1);
        btnnext = (Button) findViewById(R.id.btnlanjut);

        btnnext.setOnClickListener(this);

        Button btn = (Button) findViewById(R.id.pilihan1);
        Button btn2 = (Button) findViewById(R.id.pilihan2);
        Button btn3 = (Button) findViewById(R.id.pilihan3);
        Button btn4 = (Button) findViewById(R.id.pilihan4);
        Button btn5 = (Button) findViewById(R.id.pilihan5);
        Button btn6 = (Button) findViewById(R.id.pilihan6);
        Button btn7 = (Button) findViewById(R.id.pilihan7);
        Button btn8 = (Button) findViewById(R.id.pilihan8);
        Button btn9 = (Button) findViewById(R.id.pilihan9);
        Button btn10 = (Button) findViewById(R.id.pilihan10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_LONG).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_LONG).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_LONG).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_LONG).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_LONG).show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_LONG).show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_LONG).show();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_LONG).show();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Displaying simple Toast message
                Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.btnlanjut:
                i = new Intent(this, Aktivitas2Activity.class);
                startActivity(i);
                break;
        }
    }
}


