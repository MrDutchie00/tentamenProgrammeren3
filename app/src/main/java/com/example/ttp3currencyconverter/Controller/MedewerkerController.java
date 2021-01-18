package com.example.ttp3currencyconverter.Controller;

import com.example.ttp3currencyconverter.Modal.Medewerker;


public class MedewerkerController {
    Medewerker medewerker;

    //toevoegen van een medewerker
    public void addMember(String naam, String email, String telefoon){
        medewerker = new Medewerker(naam, email, telefoon);
        //Gegevens uitprinten voor de zekerheid of de gegevens kloppen.
        System.out.println(medewerker.toString());
    }

}
