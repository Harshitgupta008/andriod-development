package com.questionbank.aktuquantumapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.questionbank.aktuquantumapp.adapter.QuantumsAdapter;
import com.rajat.pdfviewer.PdfViewerActivity;

import java.util.ArrayList;

public class SelectQuantumActivity extends AppCompatActivity {

    private QuantumsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_quantum);

        int year = getIntent().getIntExtra("year", 1);

        getSupportActionBar().setTitle("Select Subject of Year: " + year);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        ArrayList<Quantum> quantums = new ArrayList<>();

        RecyclerView container = findViewById(R.id.quantum_container);

        container.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter = new QuantumsAdapter(quantums, this);

        adapter.setOnClickListener(position -> {
            Intent intent = new Intent(this, SelectUnitActivity.class);
            intent.putExtra("name", quantums.get(position).getName());
            intent.putExtra("unit1", quantums.get(position).getUnit1());
            intent.putExtra("unit2", quantums.get(position).getUnit2());
            intent.putExtra("unit3", quantums.get(position).getUnit3());
            intent.putExtra("unit4", quantums.get(position).getUnit4());
            intent.putExtra("unit5", quantums.get(position).getUnit5());
            //Intent intent = PdfViewerActivity.Companion.launchPdfFromUrl(this, quantums.get(position).getLinkToPdf(), quantums.get(position).getName(),
                    //"", false);

            startActivity(intent);
        });

        container.setAdapter(adapter);

        CollectionReference collectionReference = db.collection("year" + year);

        collectionReference.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                for (QueryDocumentSnapshot document : task.getResult()) {
                    Log.d("SelectQuantumActivity", document.getId() + " => " + document.getData());
                    Quantum quantum = new Quantum();
                    quantum.setName(document.getString("name"));
                    quantum.setId(document.getId());
                    quantum.setUnit1(document.getString("unit1"));
                    quantum.setUnit2(document.getString("unit2"));
                    quantum.setUnit3(document.getString("unit3"));
                    quantum.setUnit4(document.getString("unit4"));
                    quantum.setUnit5(document.getString("unit5"));
                    quantum.setLinkToPdf(document.getString("linkToPDF"));
                    quantums.add(quantum);
                }
                findViewById(R.id.progress_circular).setVisibility(View.GONE);
                container.setVisibility(View.VISIBLE);
                adapter.notifyDataSetChanged();
            } else {
                Log.d("SelectQuantumActivity", "Error getting documents: ", task.getException());
            }
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