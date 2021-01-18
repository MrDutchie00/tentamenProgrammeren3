package com.example.ttp3currencyconverter.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.ttp3currencyconverter.Controller.MedewerkerController;
import com.example.ttp3currencyconverter.Modal.Medewerker;
import com.example.ttp3currencyconverter.R;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
    //medewerkercontroller aanmaken
    MedewerkerController MC = new MedewerkerController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newMember(View view) {
        //Belangrijke velden ophalen waar we informatie uit moeten halen.
        EditText edNaam = findViewById(R.id.edNaam);
        EditText edEmail = findViewById(R.id.edEmail);
        EditText edTelefoon = findViewById(R.id.edTelefoon);

        //medewerker wordt via de medewerkercontroller aangemaakt.
        MC.addMember(edNaam.getText().toString(), edEmail.getText().toString(), edTelefoon.getText().toString());

        //een Intent klaar zetten om naar het volgende scherm te gaan
        Intent intent = new Intent(this, Main2Activity.class);

        //Naam meegeven omdat het problemen geeft vanuit de medewerker klasse.
        intent.putExtra("NAME", edNaam.getText().toString());

        //Naar het volgende scherm gaan
        startActivity(intent);
    }
}
