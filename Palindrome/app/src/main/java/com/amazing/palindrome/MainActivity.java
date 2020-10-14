package com.amazing.palindrome;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText textPalindrome;

    private Button buttonCek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textPalindrome = findViewById(R.id.edittext);
//        textHasil = findViewById(R.id.hasiltext);
        buttonCek = findViewById(R.id.cek);

        buttonCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Check();
            }
        });

    }
    public void Check() {
        if (textPalindrome.getText().toString().equals("A nut for a jar of tuna.")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        } else if (textPalindrome.getText().toString().equals("Al lets Della call Ed \"Stella\".")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        }else if (textPalindrome.getText().toString().equals("Amore, Roma.")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        }else if (textPalindrome.getText().toString().equals("Borrow or rob?")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        }else if (textPalindrome.getText().toString().equals("King, are you glad you are king?")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        }else if (textPalindrome.getText().toString().equals("Taco cat")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        }else if (textPalindrome.getText().toString().equals("Was it a car or a cat I saw?")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        }else if (textPalindrome.getText().toString().equals("Oozy rat in a sanitary zoo.")) {
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Bukan Palindrome", Toast.LENGTH_SHORT).show();
        }
    }
}