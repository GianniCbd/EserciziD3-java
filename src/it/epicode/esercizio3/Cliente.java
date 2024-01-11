package it.epicode.esercizio3;

import java.time.LocalDate;

public class Cliente {

    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(String codice, String nome, String cognome, String email, LocalDate dataIscrizione) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    public String toString() {
        return String.format("Cliente %s: %s %s, email %s, data iscrizione %s", codice, nome, cognome, email, dataIscrizione);
    }
}
