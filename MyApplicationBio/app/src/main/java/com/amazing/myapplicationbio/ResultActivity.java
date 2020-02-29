package com.amazing.myapplicationbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView txtScore = (TextView) findViewById(R.id.textScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int a = 5;
        txtScore.setText("NILAIMU :\n" + score*a);

    }

    public void onClick(View view) {
        Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
        startActivity(intent);
    }


}

