package it.epicode.esercizio2;

public class esercizio2 {

    public static void main(String[] args) {
        SIM sim = new SIM(333459690, 20);

        sim.aggiungiChiamata(1, 238283);
        sim.aggiungiChiamata(2, 548263);
        sim.aggiungiChiamata(3, 13213);
        sim.aggiungiChiamata(4, 23435);
        sim.aggiungiChiamata(5, 3131332);


        System.out.println("Numero di telefono: " + sim.getNumeroTelefono());
        System.out.println("Credito: " + sim.getCredito());

        sim.stampaChiamate();

    }


}
