package com.covid.ruangcoding.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.covid.ruangcoding.R;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        TextView t = (TextView) findViewById(R.id.txt1);
        t.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t1 = (TextView) findViewById(R.id.txt2);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2 = (TextView) findViewById(R.id.txt3);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
