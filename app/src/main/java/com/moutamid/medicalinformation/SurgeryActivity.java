package com.moutamid.medicalinformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.moutamid.medicalinformation.adapters.ListAdapter;

import java.util.ArrayList;

public class SurgeryActivity extends AppCompatActivity {

    RecyclerView cardi, dermo, emerg, endo, gasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surgery);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Surgery");

        cardi = findViewById(R.id.BreastRc);
        dermo = findViewById(R.id.ColorectalRc);
        emerg = findViewById(R.id.EndocrineRc);
        endo = findViewById(R.id.GeneralRc);
        gasto = findViewById(R.id.HepatoRc);


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

        list.add("Abscess Of Liver");
        list.add("Acute Gastric Dilation");
        list.add("Acute Hepatitis A");
        list.add("Acute Hepatitis B");
        list.add("Acute Hepatitis C");
        list.add("Acute Hepatitis E");

        adapter = new ListAdapter(SurgeryActivity.this, list);
        gasto.setAdapter(adapter);
    }

    private void EndoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Acromegaly");
        list.add("Addison's Disease");
        list.add("Carcinoid Syndrome");
        list.add("Cushing's Disease");
        list.add("Nelson Syndrome");

        adapter = new ListAdapter(SurgeryActivity.this, list);
        endo.setAdapter(adapter);
    }

    private void EmergAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Acute Respiratory Failure");
        list.add("Addisonian Crisis");
        list.add("Cardiac Arrest");
        list.add("Diabetic Coma");
        list.add("Thyroid Crysis");

        adapter = new ListAdapter(SurgeryActivity.this, list);
        emerg.setAdapter(adapter);
    }

    private void DermoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Acrodermatitis Enteropathic");
        list.add("Allergic Dermatitis");
        list.add("Erythrasma");
        list.add("Black Piedra");
        list.add("Nevus");

        adapter = new ListAdapter(SurgeryActivity.this, list);
        dermo.setAdapter(adapter);
    }

    private void CardiAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Acrocyanosis");
        list.add("Acroparasthesis");
        list.add("Acute Myocarditis");
        list.add("Cardiomegaly");
        list.add("Dressler Syndrome");

        adapter = new ListAdapter(SurgeryActivity.this, list);
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