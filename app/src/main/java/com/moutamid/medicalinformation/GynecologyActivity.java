package com.moutamid.medicalinformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.moutamid.medicalinformation.adapters.ListAdapter;

import java.util.ArrayList;

public class GynecologyActivity extends AppCompatActivity {
    RecyclerView cardi, dermo, emerg, endo, gasto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gynecology);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Gynecology & Obstetrics");

        cardi = findViewById(R.id.FetalRc);
        dermo = findViewById(R.id.GeneralRc);
        emerg = findViewById(R.id.OncologyRc);
        endo = findViewById(R.id.ObstetricsRc);
        gasto = findViewById(R.id.SexualRc);


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

        list.add("Adrenal Pseudohermaphoroditism");
        list.add("Amenorrhea");
        list.add("Anovulation");
        list.add("Bacterial Vaginosis");
        list.add("Cervicitis");
        list.add("Hirsuitism");

        adapter = new ListAdapter(GynecologyActivity.this, list);
        gasto.setAdapter(adapter);
    }

    private void EndoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Abnormal Labor");
        list.add("Anemia In Pregnancy");
        list.add("Antiphospholipid Syndrome And Pregnancy");
        list.add("Asthma In Pregnancy");
        list.add("Breech Presentation");

        adapter = new ListAdapter(GynecologyActivity.this, list);
        endo.setAdapter(adapter);
    }

    private void EmergAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Cervical Carcinoma");
        list.add("Choriocarcinoma");
        list.add("Endometrial Cancer");
        list.add("Gestational Trophoblastic Diseases");
        list.add("Ovarian Cancer");

        adapter = new ListAdapter(GynecologyActivity.this, list);
        emerg.setAdapter(adapter);
    }

    private void DermoAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Chronic Pelvic Pain");
        list.add("Dysfunctional Uterine Bleeding");
        list.add("Dysmenorrhea");
        list.add("Early Pregnancy Loss");
        list.add("Menorrhagia");

        adapter = new ListAdapter(GynecologyActivity.this, list);
        dermo.setAdapter(adapter);
    }

    private void CardiAdapter() {
        ArrayList<String> list = new ArrayList<>();
        ListAdapter adapter;

        list.add("Cord Prolapse");
        list.add("Fetal Growth Restriction");
        list.add("Macrosomia");
        list.add("Multifetal Pregnancy");
        list.add("Rh Incompatibility");

        adapter = new ListAdapter(GynecologyActivity.this, list);
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