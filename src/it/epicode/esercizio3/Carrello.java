package it.epicode.esercizio3;

public class Carrello {

    private Cliente cliente;
    private Articoli[]articoli;
    private double totale;

    public Carrello(Cliente cliente){
        this.cliente = cliente;
        this.articoli = new Articoli[0];
        this.totale = 0.0;
    }


}
