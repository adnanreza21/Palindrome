package com.amazing.myapplicationgigih.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.amazing.myapplicationgigih.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Materi5Activity extends AppCompatActivity {

    ImageView GambarGif1, GambarGif2, GambarGif3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi5);
        // TAMBAHKAN INI
        GambarGif1 = (ImageView) findViewById(R.id.gifsatu);
        GambarGif2 = (ImageView) findViewById(R.id.gifdua);
        GambarGif3 = (ImageView) findViewById(R.id.giftiga);

        Glide.with(Materi5Activity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.gif1)
                .asGif()
                //PENGATURAN CACHE
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif1);

        Glide.with(Materi5Activity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.gif2)
                .asGif()
                //PENGATURAN CACHE
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif2);

        Glide.with(Materi5Activity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.gif3)
                .asGif()
                //PENGATURAN CACHE
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif3);
    }
}
