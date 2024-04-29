/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto_moto;

/**
 *
 * @author Studente
 */
public class Scuderia {
    private static final int N_MAX_PILOTI = 4;
    private String nomeScuderia;
    private int idSquadra;
    private int punti;
    private Pilota[] piloti;
    private int nPilotiPresenti;

    public Scuderia() {
        this.piloti = new Pilota[N_MAX_PILOTI];
        this.nPilotiPresenti = 0;
    }

    public Scuderia(Scuderia scuderia) {
        this.nomeScuderia = scuderia.getNomeScuderia();
        this.idSquadra = scuderia.getIDSquadra();
        this.punti = 0;
        this.piloti = new Pilota[N_MAX_PILOTI];
        this.nPilotiPresenti = 0;
    }

    public String getNomeScuderia() {
        return nomeScuderia;
    }

    public int getIDSquadra() {
        return idSquadra;
    }

    public int getNPilotiPresenti() {
        return nPilotiPresenti;
    }

    public int getN_MAX_PILOTI() {
        return N_MAX_PILOTI;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public void setNomeSquadra(String nome) {
        this.nomeScuderia = nome;
    }

    public void aggiungiPilota(Pilota pilota) {
        if (nPilotiPresenti < N_MAX_PILOTI) {
            piloti[nPilotiPresenti] = pilota;
            nPilotiPresenti++;
        } else {
            System.out.println("Numero massimo di piloti raggiunto.");
        }
    }

    public void rimuoviPilota(int id) {
        for (int i = 0; i < nPilotiPresenti; i++) {
            if (piloti[i].getID() == id) {
                for (int j = i; j < nPilotiPresenti - 1; j++) {
                    piloti[j] = piloti[j + 1];
                }
                piloti[nPilotiPresenti - 1] = null;
                nPilotiPresenti--;
                return;
            }
        }
        System.out.println("Pilota non trovato.");
    }

    public void visualizzaScuderia(String nome) {
        if (nomeScuderia.equals(nome)) {
            System.out.println("Scuderia: " + nomeScuderia);
            System.out.println("ID Squadra: " + idSquadra);
            System.out.println("Punti: " + punti);
            System.out.println("Numero piloti: " + nPilotiPresenti);
            for (int i = 0; i < nPilotiPresenti; i++) {
                System.out.println("Pilota " + (i + 1) + ": " + piloti[i]);
            }
        } else {
            System.out.println("Scuderia non trovata.");
        }
    }

    public Pilota getPilota(int id) {
        for (int i = 0; i < nPilotiPresenti; i++) {
            if (piloti[i].getID()== id) {
                return piloti[i];
            }
        }
        return null;
    }

    public void modificaPilota(int id) {
        for (int i = 0; i < nPilotiPresenti; i++) {
            if (piloti[i].getID() == id) {
                // Implementa la logica per la modifica del pilota
                return;
            }
        }
        System.out.println("Pilota non trovato.");
    }

    @Override
    public String toString() {
        return "Scuderia{" + "nomeScuderia=" + nomeScuderia + ", idSquadra=" + idSquadra + ", punti=" + punti + ", piloti=" + piloti + ", nPilotiPresenti=" + nPilotiPresenti + '}';
    }

   
}

