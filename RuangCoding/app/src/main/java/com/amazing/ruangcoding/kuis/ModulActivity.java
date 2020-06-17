package com.amazing.ruangcoding.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.amazing.ruangcoding.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class ModulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul);
        PDFView pdfView = findViewById(R.id.modul);
        pdfView.fromAsset("modul.pdf")
                .pages(0,1,2,3,4)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true)
                .spacing(0)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();
    }
}
