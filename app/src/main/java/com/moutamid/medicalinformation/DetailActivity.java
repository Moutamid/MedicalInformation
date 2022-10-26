package com.moutamid.medicalinformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.moutamid.medicalinformation.adapters.HistoryAdapter;
import com.moutamid.medicalinformation.model.HistoryModel;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    String Actiontitle;
    TextView historyText;
    ArrayList<HistoryModel> list;
    HistoryAdapter adapter;
    HistoryModel model;
    String[] title, desc;
    String history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Actiontitle = getIntent().getStringExtra("title");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(Actiontitle);

        historyText = findViewById(R.id.history);
        list = new ArrayList<>();

        if (Actiontitle.equals("Acrocyanosis")){
            history = getResources().getString(R.string.Acrocyanosis_history);
            historyText.setText(history);
        }
        if (Actiontitle.equals("Acroparesthesia")){
            history = getResources().getString(R.string.Acroparesthesia_history);
            historyText.setText(history);
        }
        if (Actiontitle.equals("Acute Myocarditis")){
            history = getResources().getString(R.string.Acute_Myocarditis_history);
            historyText.setText(history);
        }
        if (Actiontitle.equals("Cardiomegaly")){
            history = getResources().getString(R.string.Cardiomegaly_history);
            historyText.setText(history);
        }
        if (Actiontitle.equals("Dressler Syndrome")){
            history = getResources().getString(R.string.Dressler_history);
            historyText.setText(history);
        }

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