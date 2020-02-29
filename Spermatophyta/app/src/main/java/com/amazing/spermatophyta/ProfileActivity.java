package com.amazing.spermatophyta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amazing.spermatophyta.materi.MlimaActivity;
import com.amazing.spermatophyta.silabus.ProfileDsnActivity;
import com.amazing.spermatophyta.silabus.ProfileMhsActivity;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView Card1,Card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Card1 = (CardView) findViewById(R.id.card1);
        Card2 = (CardView) findViewById(R.id.card2);

        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this, ProfileDsnActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this, ProfileMhsActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
