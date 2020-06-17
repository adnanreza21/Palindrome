package com.amazing.ruangcoding.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.amazing.ruangcoding.R;
import com.amazing.ruangcoding.menu.QuizActivity;

public class ResultQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);
        TextView txtScore = (TextView) findViewById(R.id.textScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int a = 20;
        txtScore.setText("Nilaimu :\n" + score*a/3);

    }

    public void onClick(View view) {
        Intent intent = new Intent(ResultQuizActivity.this, QuizActivity.class);
        startActivity(intent);
    }


}
