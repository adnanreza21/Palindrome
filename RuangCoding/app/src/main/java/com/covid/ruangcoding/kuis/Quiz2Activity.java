package com.covid.ruangcoding.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.covid.ruangcoding.MainActivity;
import com.covid.ruangcoding.R;
import com.covid.ruangcoding.menu.QuizActivity;

public class Quiz2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        TextView txtScore = (TextView) findViewById(R.id.textScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int a = 20;
        txtScore.setText("Nilaimu :\n" + score*a/3);

        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();
            }
        });
    }

    protected void sendEmail() {
        TextView txtScore = (TextView) findViewById(R.id.textScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int a = 20;
        txtScore.setText("Nilaimu :\n" + score*a/3);

        Log.i("Send email", "");
        String[] TO = {"rezaadnan62@gmail.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nilai Kuis Basis Data");
        emailIntent.putExtra(Intent.EXTRA_TEXT, " Nilai saya adalah :\n" + score*a/3 + "\n saya mengerjakan dengan jujur");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished ", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Quiz2Activity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick(View view) {
        Intent intent = new Intent(Quiz2Activity.this, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}