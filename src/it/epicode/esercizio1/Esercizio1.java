package it.epicode.esercizio1;


import static it.epicode.esercizio1.Rettangolo.StampaRettangoli;
import static it.epicode.esercizio1.Rettangolo.StampaRettangolo;

public class Esercizio1 {


    public static void main(String[] args) {

         Rettangolo rettangolo1 = new Rettangolo( 30,50);
         Rettangolo rettangolo2 = new Rettangolo(45,70);

         System.out.println("Rettangolo1: ");
        StampaRettangolo(rettangolo1);
        System.out.println("Rettangolo2: ");
        StampaRettangolo(rettangolo2);


        StampaRettangoli(rettangolo1,rettangolo2);
    }


}