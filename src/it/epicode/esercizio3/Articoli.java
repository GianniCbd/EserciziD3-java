package it.epicode.esercizio3;

public class Articoli {

    private String codiceArticolo;
    private String descrizioneArticolo;
    private Double prezzo;
    private int pezziDisponibili;

    public Articoli(String codiceArticolo, String descrizioneArticolo, Double prezzo, int pezziDisponibili){
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }

    public String toString() {
        return String.format("Articolo %s: %s, prezzo %.2f, pezzi disponibili %d", codiceArticolo, descrizioneArticolo, prezzo, pezziDisponibili);
    }
}
