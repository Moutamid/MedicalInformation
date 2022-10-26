package com.moutamid.medicalinformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.moutamid.medicalinformation.adapters.ListAdapter;

import java.util.ArrayList;

public class PsychiatryActivity extends AppCompatActivity {
    RecyclerView cardi, dermo, emerg, endo, gasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychiatry);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Psychiatry");

        cardi = findViewById(R.id.AnxietyRc);
        dermo = findViewById(R.id.DeliriumRc);
        emerg = findViewById(R.id.InfancyRc);
        endo = findViewById(R.id.EatingRc);
        gasto = findViewById(R.id.MoodRc);


        cardi.setHasFixedSize(false);
        cardi.setLayoutManager(new LinearLayoutManager(this));
        CardiAdapter();

        dermo.setHasFixedSize(false);
        dermo.setLayoutManager(new LinearLayoutManager(this));
        DermoAdapter();

        emerg.setHasFixedSize(false);
        emerg.setLayoutManager(new LinearLayoutManager(this));
        EmergAdapter();

        endo.setHasFixedSize(false);
        endo.setLayoutManager(new LinearLayoutManager(this));
        EndoAdapter();

        gasto.setHasFixedSize(false);
        gasto.setLayoutManager(new LinearLayoutManager(this));
        GastoAdapter();

    }

    private void GastoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Bipolar Disorder");
        list.add("Depressive Disorder");

        adapter = new ListAdapter(PsychiatryActivity.this, list);
        gasto.setAdapter(adapter);
    }

    private void EndoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Anorexia Nervosa");
        list.add("Bulimia Nervosa");

        adapter = new ListAdapter(PsychiatryActivity.this, list);
        endo.setAdapter(adapter);
    }

    private void EmergAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Attention-deficit And Disruptive Behaviour Disorders");
        list.add("Tic Disorders");

        adapter = new ListAdapter(PsychiatryActivity.this, list);
        emerg.setAdapter(adapter);
    }

    private void DermoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Amnestic Disorders");
        list.add("Delirium");
        list.add("Dementia");

        adapter = new ListAdapter(PsychiatryActivity.this, list);
        dermo.setAdapter(adapter);
    }

    private void CardiAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Acute Stress Disorder");
        list.add("Social Phobia");
        list.add("Specific Phobia");
        list.add("Panic Disorder Without Agoraphobia");
        list.add("Generalized Anxiety Disorder");

        adapter = new ListAdapter(PsychiatryActivity.this, list);
        cardi.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}