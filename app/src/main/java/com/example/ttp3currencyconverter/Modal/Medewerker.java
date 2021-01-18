package com.example.ttp3currencyconverter.Modal;

public class Medewerker extends Persoon {

    //attributen
    private String telefoon;

    //constructor met super naar de Persoon klasse.
    public Medewerker (String naam, String email, String telefoon){
        this.telefoon = telefoon;
        super.naam = naam;
        super.email = email;
    }

    //Getters en setters
    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }


    //toString methode
    @Override
    public String toString() {
        return "Medewerker{" +
                "telefoon='" + telefoon + '\'' +
                ", naam='" + naam + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
