package com.covid.ruangcoding.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.covid.ruangcoding.MainActivity;
import com.covid.ruangcoding.R;
import com.covid.ruangcoding.menu.QuizActivity;

public class ResultQuizActivity extends AppCompatActivity {
    private static Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);
        button = (Button) findViewById(R.id.mulai);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
    }
    public void openHomeActivity(){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}