/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto_moto;

/**
 *
 * @author Studente
 */
public class Campionato {
    private static final int N_MAX_SCUDERIE = 10;
    private int nScuderiePresenti;
    private Scuderia[] scuderie;

    public Campionato() {
        this.nScuderiePresenti = 0;
        this.scuderie = new Scuderia[N_MAX_SCUDERIE];
    }

    public Campionato(Campionato c1) {
        this.nScuderiePresenti = c1.getNScuderiePresenti();
        this.scuderie = new Scuderia[N_MAX_SCUDERIE];
        for (int i = 0; i < nScuderiePresenti; i++) {
            this.scuderie[i] = new Scuderia(c1.scuderie[i]);
        }
    }

    public int getNScuderiePresenti() {
        return nScuderiePresenti;
    }

    public int getN_MAX_SCUDERIE() {
        return N_MAX_SCUDERIE;
    }

    public void setPilota(String nomeScuderia) {
        for (int i = 0; i < nScuderiePresenti; i++) {
            if (scuderie[i].getNomeScuderia().equals(nomeScuderia)) {
                scuderie[i].aggiungiPilota(idPilota);
                return;
            }
        }
        System.out.println("Scuderia non trovata.");
    }

    public void setScuderia(Scuderia scuderia) {
        if (nScuderiePresenti < N_MAX_SCUDERIE) {
            scuderie[nScuderiePresenti] = scuderia;
            nScuderiePresenti++;
        } else {
            System.out.println("Numero massimo di scuderie raggiunto.");
        }
    }

    public Pilota getPilota(int id) {
        for (int i = 0; i < nScuderiePresenti; i++) {
            Pilota pilota = scuderie[i].getPilota(id);
            if (pilota != null) {
                return pilota;
            }
        }
        System.out.println("Pilota non trovato.");
        return null;
    }

    public Scuderia getScuderia(int id) {
        for (int i = 0; i < nScuderiePresenti; i++) {
            if (scuderie[i].getIDSquadra() == id) {
                return scuderie[i];
            }
        }
        System.out.println("Scuderia non trovata.");
        return null;
    }

    public void rimuoviPilota(int id) {
        for (int i = 0; i < nScuderiePresenti; i++) {
            if (scuderie[i].getPilota(id) != null) {
                scuderie[i].rimuoviPilota(id);
                return;
            }
        }
        System.out.println("Pilota non trovato.");
    }

    public void rimuoviScuderia(int id) {
        for (int i = 0; i < nScuderiePresenti; i++) {
            if (scuderie[i].getIDSquadra() == id) {
                for (int j = i; j < nScuderiePresenti - 1; j++) {
                    scuderie[j] = scuderie[j + 1];
                }
                scuderie[nScuderiePresenti - 1] = null;
                nScuderiePresenti--;
                return;
            }
        }
        System.out.println("Scuderia non trovata.");
    }

    public void visualizzaClassifica() {
        // Implementa la logica per visualizzare la classifica
    }

    @Override
    public String toString() {
        return "Campionato{" +
                "nScuderiePresenti=" + nScuderiePresenti +
                '}';
    }

    public void salvaDatiCSV(String nomeFile) {
        // Implementa la logica per salvare i dati in formato CSV
    }

    public void caricaDatiCSV(String nomeFile) {
        // Implementa la logica per caricare i dati da un file CSV
    }

    public void salvaDatiBIN(String nomeFile) {
        // Implementa la logica per salvare i dati in formato BIN
    }

    public void caricaDatiBIN(String nomeFile) {
        // Implementa la logica per caricare i dati da un file BIN
    }

    public void modificaPunteggio(Scuderia s) {
        // Implementa la logica per modificare il punteggio di una scuderia
    }

    public void modificaPilota(int id) {
        // Implementa la logica per modificare un pilota
    }
}