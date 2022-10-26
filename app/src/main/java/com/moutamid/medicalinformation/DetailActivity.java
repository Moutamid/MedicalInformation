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
    String history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Actiontitle = getIntent().getStringExtra("title");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(Actiontitle);

        historyText = findViewById(R.id.history);

        medicine();
        pediatrics();

    }

    private void pediatrics() {
        if (Actiontitle.equals("Acrocyanosis")){
            history = getResources().getString(R.string.Acrocyanosis_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Acroparesthesia")){
            history = getResources().getString(R.string.Acroparesthesia_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Myocarditis")){
            history = getResources().getString(R.string.Acute_Myocarditis_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Cardiomegaly")){
            history = getResources().getString(R.string.Cardiomegaly_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Dressler Syndrome")){
            history = getResources().getString(R.string.Dressler_history);
            historyText.setText(history);
        }
//-------------------
        if (Actiontitle.equals("Acrodermatitis Enteropathic")){
            history = getResources().getString(R.string.Acrodermatitis_Enteropathic_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Allergic Dermatitis")){
            history = getResources().getString(R.string.Allergic_Dermatitis_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Erythrasma")){
            history = getResources().getString(R.string.Erythrasma_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Black Piedra")){
            history = getResources().getString(R.string.Black_Piedra_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Nevus")){
            history = getResources().getString(R.string.Nevus_history);
            historyText.setText(history);
        }
//------------------------
        if (Actiontitle.equals("Acute Respiratory Failure")){
            history = getResources().getString(R.string.Acute_Respiratory_Failure);
            historyText.setText(history);
        } if (Actiontitle.equals("Addisonian Crisis")){
            history = getResources().getString(R.string.Addisonian_Crisis);
            historyText.setText(history);
        } if (Actiontitle.equals("Cardiac Arrest")){
            history = getResources().getString(R.string.Cardiac_Arrest);
            historyText.setText(history);
        } if (Actiontitle.equals("Diabetic Coma")){
            history = getResources().getString(R.string.Diabetic_Coma);
            historyText.setText(history);
        } if (Actiontitle.equals("Thyroid Crysis")){
            history = getResources().getString(R.string.Thyroid_Crysis);
            historyText.setText(history);
        }
//-----------------------------------
        if (Actiontitle.equals("Acromegaly")){
            history = getResources().getString(R.string.Acromegaly);
            historyText.setText(history);
        } if (Actiontitle.equals("Addison\'s Disease")){
            history = getResources().getString(R.string.Addisons_Disease);
            historyText.setText(history);
        } if (Actiontitle.equals("Carcinoid Syndrome")){
            history = getResources().getString(R.string.Carcinoid_Syndrome);
            historyText.setText(history);
        } if (Actiontitle.equals("Cushing\'s Disease")){
            history = getResources().getString(R.string.Cushings_Disease);
            historyText.setText(history);
        } if (Actiontitle.equals("Nelson Syndrome")){
            history = getResources().getString(R.string.Nelson_Syndrome);
            historyText.setText(history);
        }
//---------------------------------

        if (Actiontitle.equals("Abscess Of Liver")){
            history = getResources().getString(R.string.Abscess_Of_Liver);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Gastric Dilation")){
            history = getResources().getString(R.string.Acute_Gastric_Dilation);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis A")){
            history = getResources().getString(R.string.Acute_Hepatitis_A);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis B")){
            history = getResources().getString(R.string.Acute_Hepatitis_B);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis C")){
            history = getResources().getString(R.string.Acute_Hepatitis_C);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis E")){
            history = getResources().getString(R.string.Acute_Hepatitis_E);
            historyText.setText(history);
        }
    }

    private void medicine() {
        if (Actiontitle.equals("Acrocyanosis")){
            history = getResources().getString(R.string.Acrocyanosis_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Acroparesthesia")){
            history = getResources().getString(R.string.Acroparesthesia_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Myocarditis")){
            history = getResources().getString(R.string.Acute_Myocarditis_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Cardiomegaly")){
            history = getResources().getString(R.string.Cardiomegaly_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Dressler Syndrome")){
            history = getResources().getString(R.string.Dressler_history);
            historyText.setText(history);
        }
//-------------------
        if (Actiontitle.equals("Acrodermatitis Enteropathic")){
            history = getResources().getString(R.string.Acrodermatitis_Enteropathic_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Allergic Dermatitis")){
            history = getResources().getString(R.string.Allergic_Dermatitis_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Erythrasma")){
            history = getResources().getString(R.string.Erythrasma_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Black Piedra")){
            history = getResources().getString(R.string.Black_Piedra_history);
            historyText.setText(history);
        } if (Actiontitle.equals("Nevus")){
            history = getResources().getString(R.string.Nevus_history);
            historyText.setText(history);
        }
//------------------------
        if (Actiontitle.equals("Acute Respiratory Failure")){
            history = getResources().getString(R.string.Acute_Respiratory_Failure);
            historyText.setText(history);
        } if (Actiontitle.equals("Addisonian Crisis")){
            history = getResources().getString(R.string.Addisonian_Crisis);
            historyText.setText(history);
        } if (Actiontitle.equals("Cardiac Arrest")){
            history = getResources().getString(R.string.Cardiac_Arrest);
            historyText.setText(history);
        } if (Actiontitle.equals("Diabetic Coma")){
            history = getResources().getString(R.string.Diabetic_Coma);
            historyText.setText(history);
        } if (Actiontitle.equals("Thyroid Crysis")){
            history = getResources().getString(R.string.Thyroid_Crysis);
            historyText.setText(history);
        }
//-----------------------------------
        if (Actiontitle.equals("Acromegaly")){
            history = getResources().getString(R.string.Acromegaly);
            historyText.setText(history);
        } if (Actiontitle.equals("Addison\'s Disease")){
            history = getResources().getString(R.string.Addisons_Disease);
            historyText.setText(history);
        } if (Actiontitle.equals("Carcinoid Syndrome")){
            history = getResources().getString(R.string.Carcinoid_Syndrome);
            historyText.setText(history);
        } if (Actiontitle.equals("Cushing\'s Disease")){
            history = getResources().getString(R.string.Cushings_Disease);
            historyText.setText(history);
        } if (Actiontitle.equals("Nelson Syndrome")){
            history = getResources().getString(R.string.Nelson_Syndrome);
            historyText.setText(history);
        }
//---------------------------------

        if (Actiontitle.equals("Abscess Of Liver")){
            history = getResources().getString(R.string.Abscess_Of_Liver);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Gastric Dilation")){
            history = getResources().getString(R.string.Acute_Gastric_Dilation);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis A")){
            history = getResources().getString(R.string.Acute_Hepatitis_A);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis B")){
            history = getResources().getString(R.string.Acute_Hepatitis_B);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis C")){
            history = getResources().getString(R.string.Acute_Hepatitis_C);
            historyText.setText(history);
        } if (Actiontitle.equals("Acute Hepatitis E")){
            history = getResources().getString(R.string.Acute_Hepatitis_E);
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