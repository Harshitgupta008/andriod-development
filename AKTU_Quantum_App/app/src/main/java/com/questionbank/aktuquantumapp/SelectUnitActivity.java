package com.questionbank.aktuquantumapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.rajat.pdfviewer.PdfViewerActivity;

public class SelectUnitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_unit);

        getSupportActionBar().setTitle(getIntent().getStringExtra("name"));
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.Unit_1_select).setOnClickListener(view -> {
            Intent intent = PdfViewerActivity.Companion.launchPdfFromUrl(this, getIntent().getStringExtra("unit1"), getIntent().getStringExtra("name"),
                    "", false);
            startActivity(intent);
        });
        findViewById(R.id.Unit_2_select).setOnClickListener(view -> {
            Intent intent = PdfViewerActivity.Companion.launchPdfFromUrl(this, getIntent().getStringExtra("unit2"), getIntent().getStringExtra("name"),
                    "", false);
            startActivity(intent);
        });
        findViewById(R.id.Unit_3_select).setOnClickListener(view -> {
            Intent intent = PdfViewerActivity.Companion.launchPdfFromUrl(this, getIntent().getStringExtra("unit3"), getIntent().getStringExtra("name"),
                    "", false);
            startActivity(intent);
        });
        findViewById(R.id.Unit_4_select).setOnClickListener(view -> {
            Intent intent = PdfViewerActivity.Companion.launchPdfFromUrl(this, getIntent().getStringExtra("unit4"), getIntent().getStringExtra("name"),
                    "", false);
            startActivity(intent);
        });
        findViewById(R.id.Unit_5_select).setOnClickListener(view -> {
            Intent intent = PdfViewerActivity.Companion.launchPdfFromUrl(this, getIntent().getStringExtra("unit5"), getIntent().getStringExtra("name"),
                    "", false);
            startActivity(intent);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}