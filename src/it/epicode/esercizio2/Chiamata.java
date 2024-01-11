package it.epicode.esercizio2;

public class Chiamata {
    private int durata;
    private static int numeroChiamato;

    public Chiamata(int durata, int numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public static int getNumeroChiamato() {
        return numeroChiamato;
    }

    public static void setNumeroChiamato(int numeroChiamato) {
        Chiamata.numeroChiamato = numeroChiamato;
    }
}



