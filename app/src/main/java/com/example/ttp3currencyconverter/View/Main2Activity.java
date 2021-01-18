package com.example.ttp3currencyconverter.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.ttp3currencyconverter.Controller.MedewerkerController;
import com.example.ttp3currencyconverter.Controller.Rekencontroller;
import com.example.ttp3currencyconverter.R;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    //controllers aanmaken
    Rekencontroller RC = new Rekencontroller();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Naam uit de intent ophalen
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String Naam = bundle.getString("NAME");
        
        //Ervoor zorgen dat de naam van de zojuist aangemaakte medewerker bovenin staat.
        TextView tvNaam2 = findViewById(R.id.tvNaam2);
        tvNaam2.setText(Naam);
        
        //Button aanmaken en koppelen aan de button in de layout
        Button btnOmrekenen = findViewById(R.id.btnOmrekenen);
        //Onclick listener toevoegen
        btnOmrekenen.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) 
            {
                //Belangrijke velden ophalen waar we informatie uit moeten halen of neer moeten zetten.
                TextView tvUitvoer = findViewById(R.id.tvUitvoer);
                RadioButton rbEuro = findViewById(R.id.rbEuro);
                RadioButton rbDollar = findViewById(R.id.rbDollar);
                
                //Ervoor zorgen dat de juiste tekst tevoorschijn komt bij het selecteren van de RadioButtons en functie voor het omrekenen
                if(rbEuro.isChecked())
                {
                    tvUitvoer.setText("Bedrag in dollars:");
                    EditText edBedrag = findViewById(R.id.edBedrag);
                    EditText edUitvoer = findViewById(R.id.edUitvoer);
                    String SBedrag = edBedrag.getText().toString();
                    Double DBedrag = Double.parseDouble(SBedrag);
                    edUitvoer.setText(String.valueOf(RC.DollarNaarEuro(DBedrag)));
                }
                
                else if (rbDollar.isChecked())
                {
                    tvUitvoer.setText("Bedrag in euro's:");
                    EditText edBedrag = findViewById(R.id.edBedrag);
                    EditText edUitvoer = findViewById(R.id.edUitvoer);
                    String SBedrag = edBedrag.getText().toString();
                    Double DBedrag = Double.parseDouble(SBedrag);
                    edUitvoer.setText(String.valueOf(RC.EuroNaarDollar(DBedrag)));
                }
            }
        });
    }


    
}
