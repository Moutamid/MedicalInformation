package com.moutamid.medicalinformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.moutamid.medicalinformation.adapters.ListAdapter;

import java.util.ArrayList;

public class PediatricsActivity extends AppCompatActivity {
    RecyclerView cardi, dermo, genat, endo, gasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pediatrics);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pediatrics");

        cardi = findViewById(R.id.CardioRc);
        dermo = findViewById(R.id.DermatologyRc);
        genat = findViewById(R.id.GeneticRc);
        endo = findViewById(R.id.EndocrinologyRc);
        gasto = findViewById(R.id.GastroenterologyRc);


        cardi.setHasFixedSize(false);
        cardi.setLayoutManager(new LinearLayoutManager(this));
        CardiAdapter();

        dermo.setHasFixedSize(false);
        dermo.setLayoutManager(new LinearLayoutManager(this));
        DermoAdapter();

        genat.setHasFixedSize(false);
        genat.setLayoutManager(new LinearLayoutManager(this));
        GenatAdapter();

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

        list.add("Achalasia Cardia In Children");
        list.add("Intussusception");

        adapter = new ListAdapter(PediatricsActivity.this, list);
        gasto.setAdapter(adapter);
    }

    private void EndoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Sequelae Of Rickets");
        list.add("Vitamin A Deficiency");

        adapter = new ListAdapter(PediatricsActivity.this, list);
        endo.setAdapter(adapter);
    }

    private void GenatAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Achondroplasia");
        list.add("Becker\'s Muscular Dystrophy");
        list.add("Osteogenesis Imperfecta");
        list.add("Sturge-Weber Syndrome");
        list.add("Trisomy 21");

        adapter = new ListAdapter(PediatricsActivity.this, list);
        genat.setAdapter(adapter);
    }

    private void DermoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Atopic Eczema In Children");
        list.add("Impetigo in Children");
        list.add("Nevus In Children");
        list.add("Pityriasis Versicolor In Children");
        list.add("Psoriasis In Children");

        adapter = new ListAdapter(PediatricsActivity.this, list);
        dermo.setAdapter(adapter);
    }

    private void CardiAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Atrial Septal Defect");
        list.add("Coarctation Of Aorta");
        list.add("Heart Failure");
        list.add("Kawasaki Disease");
        list.add("Mitral Regurgitation In Children");

        adapter = new ListAdapter(PediatricsActivity.this, list);
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