package com.moutamid.medicalinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView greeting, quoteText, privacy;
    CardView medi, pedi, surg, psyc, gyn, DonateCard;

    private String[] quotes = {
            "The art of medicine consists in amusing the patient while nature cures the disease.",
            "The art of medicine was to be properly learned only from its practice and its exercise.",
            "Walking is man's best medicine.",
            "Thinking of disease constantly will intensify it. Feel always \'I am healthily in body and mind\'.",
            "We should be concerned not only about the health of individual patients, but also the health of our entire society.",
            "If a person is treated like a patient, they are apt to act like one."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        greeting = findViewById(R.id.greeting);
        quoteText = findViewById(R.id.quoteTxt);
        medi = findViewById(R.id.medicineCard);
        pedi = findViewById(R.id.pediatricsCard);
        surg = findViewById(R.id.surgeryCard);
        psyc = findViewById(R.id.psychriatryCard);
        gyn = findViewById(R.id.gynecologyCard);

        privacy = findViewById(R.id.privacy);
        DonateCard = findViewById(R.id.DonateCard);

        DonateCard.setOnClickListener(v -> {
            startActivity(new Intent(this, DonateActivity.class));
        });

        privacy.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/e/2PACX-1vSiDUNIEjKa4u4bGF-dJH8z1yOaM2xROWlw1-YdnBLv7PKvbMJU6Y8eQGV4HPD9orCQYfQe3ophNXBy/pub"));
            startActivity(browserIntent);
        });

        Random random = new Random();
        int index = random.nextInt(quotes.length);
        quoteText.setText(quotes[index]);

        greetingMessage();

        medi.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MedicineActivity.class));
        });
        pedi.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, PediatricsActivity.class));
        });
        surg.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SurgeryActivity.class));
        });
        psyc.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, PsychiatryActivity.class));
        });
        gyn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, GynecologyActivity.class));
        });

    }

    private void greetingMessage() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
            greeting.setText("Good Morning");
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            greeting.setText("Good Afternoon");
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            greeting.setText("Good Evening");
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            greeting.setText("Good Night");
        }
    }

}