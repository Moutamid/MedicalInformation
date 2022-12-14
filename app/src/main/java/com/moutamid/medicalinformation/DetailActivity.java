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
        if (Actiontitle.equals("Atrial Septal Defect")){
            history = getResources().getString(R.string.Atrial_Septal_Defect);
            historyText.setText(history);
        } if (Actiontitle.equals("Coarctation Of Aorta")){
            history = getResources().getString(R.string.Coarctation_Of_Aorta);
            historyText.setText(history);
        } if (Actiontitle.equals("Heart Failure")){
            history = getResources().getString(R.string.Heart_Failure);
            historyText.setText(history);
        } if (Actiontitle.equals("Kawasaki Disease")){
            history = getResources().getString(R.string.Kawasaki_Disease);
            historyText.setText(history);
        } if (Actiontitle.equals("Mitral Regurgitation In Children")){
            history = getResources().getString(R.string.Mitral_Regurgitation);
            historyText.setText(history);
        }
//-------------------
        if (Actiontitle.equals("Atopic Eczema In Children")){
            history = getResources().getString(R.string.Atopic_Eczema);
            historyText.setText(history);
        } if (Actiontitle.equals("Impetigo in Children")){
            history = getResources().getString(R.string.Impetigo_in_Children);
            historyText.setText(history);
        } if (Actiontitle.equals("Nevus In Children")){
            history = getResources().getString(R.string.Nevus_in_Children);
            historyText.setText(history);
        } if (Actiontitle.equals("Pityriasis Versicolor In Children")){
            history = getResources().getString(R.string.Pityriasis_Versicolor);
            historyText.setText(history);
        } if (Actiontitle.equals("Psoriasis In Children")){
            history = getResources().getString(R.string.Psoriasis_In_Children);
            historyText.setText(history);
        }
//------------------------
        if (Actiontitle.equals("Achondroplasia")){
            history = getResources().getString(R.string.Achondroplasia);
            historyText.setText(history);
        } if (Actiontitle.equals("Becker\'s Muscular Dystrophy")){
            history = getResources().getString(R.string.Beckers_Muscular_Dystrophy);
            historyText.setText(history);
        } if (Actiontitle.equals("Osteogenesis Imperfecta")){
            history = getResources().getString(R.string.Osteogenesis_Imperfecta);
            historyText.setText(history);
        } if (Actiontitle.equals("Sturge-Weber Syndrome")){
            history = getResources().getString(R.string.Sturge_Weber_Syndrome);
            historyText.setText(history);
        } if (Actiontitle.equals("Trisomy 21")){
            history = getResources().getString(R.string.Trisomy_21);
            historyText.setText(history);
        }
//-----------------------------------
        if (Actiontitle.equals("Sequelae Of Rickets")){
            history = getResources().getString(R.string.Sequelae_Of_Rickets);
            historyText.setText(history);
        } if (Actiontitle.equals("Vitamin A Deficiency")){
            history = getResources().getString(R.string.Vitamin_A_Deficiency);
            historyText.setText(history);
        }
//---------------------------------

        if (Actiontitle.equals("Achalasia Cardia In Children")){
            history = getResources().getString(R.string.Achalasia_Cardia);
            historyText.setText(history);
        } if (Actiontitle.equals("Intussusception")){
            history = getResources().getString(R.string.Intussusception);
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