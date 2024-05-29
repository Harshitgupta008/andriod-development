package com.questionbank.aktuquantumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;



public class PDFViewerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);

        getSupportActionBar().setTitle(getIntent().getStringExtra("name"));
        /*PDFView pdfView = findViewById(R.id.pdfView);

        ScrollBar scrollBar = findViewById(R.id.scrollBar);
        pdfView.setScrollBar(scrollBar);*/
    }
}