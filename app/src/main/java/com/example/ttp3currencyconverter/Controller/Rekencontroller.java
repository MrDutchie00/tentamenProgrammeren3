package com.example.ttp3currencyconverter.Controller;

public class Rekencontroller {
    //de koers van 1USD naar euro.
    double koers = 0.8097;

    //Het omrekenen van dollar naar euro, dus het bedrag in dollar keer de koers geeft euro.
    public double DollarNaarEuro(double bedrag){
        double uitkomst = bedrag *= koers;
        return uitkomst;
    }

    //Het omrekenen van euro naar dollar, dus het bedrag in euro gedeeld door de koers geeft dollar.
    public double EuroNaarDollar(double bedrag){
        double uitkomst = bedrag /= koers;
        return uitkomst;
    }
}
