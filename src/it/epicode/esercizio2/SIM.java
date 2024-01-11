package it.epicode.esercizio2;

public class SIM {

    private int numeroTelefono;
    private int credito;

    Chiamata [] listaChiamate;

    public SIM(int numeroTelefono, int credito){
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.listaChiamate = new Chiamata [5];
    }

    public void aggiungiChiamata(int durata, int numeroChiamato) {
        for (int i = 0; i < listaChiamate.length; i++) {
            if (listaChiamate[i] == null) {
                listaChiamate[i] = new Chiamata(durata, numeroChiamato);
                break;
            }
        }
    }

    public void stampaChiamate() {
        for (Chiamata chiamata : listaChiamate) {
            if (chiamata != null) {
                System.out.println("Durata della chiamata: " + chiamata.getDurata() + ", Numero chiamato: " + chiamata.getNumeroChiamato());
            }
        }
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }



}

