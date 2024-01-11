package it.epicode.esercizio1;

public class Rettangolo {

    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int calcPerimetro(){
        return 2 * (altezza + larghezza);
    }

    public int calcArea(){
        return altezza * larghezza;
    }

    public static void StampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Area: " + rettangolo.calcArea());
        System.out.println("Perimetro: " + rettangolo.calcPerimetro());

    }

    public static void StampaRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        int sommaAree = rettangolo1.calcArea() + rettangolo2.calcArea();
        int sommaPerimetro = rettangolo1.calcPerimetro() + rettangolo2.calcPerimetro();


        System.out.println("Somma aree: " + sommaAree);
        System.out.println("Somma Perimetri: " + sommaPerimetro);

    }

}
