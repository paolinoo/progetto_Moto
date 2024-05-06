/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto_moto;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import utilita.ConsoleInput;
import utilita.Menu;
import eccezioni.*;

/**
 *
 * @author Studente
 */
import java.io.IOException;

public class App {

    public static void main(String[] args) throws EccezioneIDNonPresente {
        int numeroVociMenu = 11;
        String[] vociMenu = new String[numeroVociMenu];
        int voceMenuScelta = 0;
        Menu menu;
        Campionato campionato = new Campionato();
        Scuderia nuovaScuderia = new Scuderia();
        
        ConsoleInput tastiera = new ConsoleInput();
        String nomeScuderia, nomePilota;
        int idPilota;

        vociMenu[0] = "0 -->\tEsci";
        vociMenu[1] = "1 -->\tVisualizza elenco scuderie";
        vociMenu[2] = "2 -->\tAggiungi scuderia";
        vociMenu[3] = "3 -->\tRimuovi scuderia";
        vociMenu[4] = "4 -->\tVisualizza elenco piloti";
        vociMenu[5] = "5 -->\tAggiungi pilota";
        vociMenu[6] = "6 -->\tRimuovi pilota";
        vociMenu[7] = "7 -->\tModifica punteggio scuderia";
        vociMenu[8] = "8 -->\tVisualizza classifica";
        vociMenu[9] = "9 -->\tSalva dati";
        vociMenu[10] = "10 -->\tCarica dati";
        menu = new Menu(vociMenu);

        do {
            try {
                voceMenuScelta = menu.sceltaMenu();
                switch (voceMenuScelta) {
                    case 0: // Esci
                        System.out.println("Arrivederci");
                        break;
                    case 1: // Visualizza elenco scuderie
                       
                        for(int i=0; i<campionato.getNScuderiePresenti();i++)
                        {
                             campionato.visualizzaScuderia(i);
                        }
                        break;
                    case 2: // Aggiungi scuderia
                        System.out.println("Nome scuderia --> ");
                        nomeScuderia = tastiera.readString();
                        
                        nuovaScuderia.setNomeSquadra(nomeScuderia);
                        campionato.setScuderia(nuovaScuderia);
                        break;
                    case 3: // Rimuovi scuderia
                        System.out.println("ID scuderia da rimuovere --> ");
                        int idScuderiaRimuovere = tastiera.readInt();
                        campionato.rimuoviScuderia(idScuderiaRimuovere);
                        break;
                    case 4: // Visualizza elenco piloti
                        visualizzaElencoPiloti(campionato);
                        break;
                    case 5: // Aggiungi pilota
                        try {
                        System.out.println("Nome pilota --> ");
                        nomePilota = tastiera.readString();
                        System.out.println("Cognome pilota --> ");
                        String cognome = tastiera.readString();
                        System.out.println("eta pilota --> ");
                        int eta = tastiera.readInt();
                        System.out.println("altezza pilota --> ");
                        int altezza = tastiera.readInt();
                        System.out.println("giorno nascita --> ");
                        int giorno = tastiera.readInt();
                        System.out.println("mese nascita --> ");
                        int mese = tastiera.readInt();
                        System.out.println("anno nascita --> ");
                        int anno = tastiera.readInt();
                        System.out.println("ID scuderia di appartenenza --> ");
                        int idScuderiaPilota = tastiera.readInt();
                        Scuderia scuderiaPilota = campionato.getScuderia(idScuderiaPilota);
                        if (scuderiaPilota != null) {
                            Pilota nuovoPilota = new Pilota(nomePilota,cognome, eta, altezza, LocalDate.MIN);
                            scuderiaPilota.aggiungiPilota(nuovoPilota);
                        } else {
                        System.out.println("Scuderia non trovata.");
                        }
                        } catch (IOException e) {
                        System.out.println("Errore di input/output: " + e.getMessage());
                        } catch (NumberFormatException e) {
                        System.out.println("Input non valido. Inserisci un numero valido per l'ID della scuderia.");
                        }
                        break;

                    case 6: // Rimuovi pilota
                        System.out.println("ID pilota da rimuovere --> ");
                        idPilota = tastiera.readInt();
                        campionato.rimuoviPilota(idPilota);
                        break;
                    case 7: // Modifica punteggio scuderia
                        System.out.println("ID scuderia --> ");
                        int idScuderia = tastiera.readInt();
                        Scuderia scuderiaDaModificare = campionato.getScuderia(idScuderia);
                        if (scuderiaDaModificare != null) {
                            System.out.println("Nuovo punteggio --> ");
                            int nuovoPunteggio = tastiera.readInt();
                            scuderiaDaModificare.setPunti(nuovoPunteggio);
                        } else {
                            System.out.println("Scuderia non trovata.");
                        }
                        break;
                    case 8: // Visualizza classifica
                        campionato.visualizzaClassifica();
                        break;
                    case 9: // Salva dati
                        System.out.println("Salvataggio dati...");
                        campionato.salvaDatiCSV("campionato.csv");
                        campionato.salvaDatiBIN("campionato.bin");
                        break;
                    case 10: // Carica dati
                        System.out.println("Caricamento dati...");
                        campionato.caricaDatiCSV("campionato.csv");
                        campionato.caricaDatiBIN("campionato.bin");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Errore di input/output: " + e.getMessage());
            }
        } while (voceMenuScelta != 0);
    }



    private static void visualizzaElencoPiloti(Campionato campionato) {
        System.out.println("Elenco piloti:");
        for (int i = 0; i < campionato.getNScuderiePresenti(); i++) {
            Scuderia scuderia = campionato.getScuderia(i);
            System.out.println("Scuderia: " + scuderia.getNomeScuderia());
            for (int j = 0; j < scuderia.getNPilotiPresenti(); j++) {
                Pilota pilota = scuderia.getPilota(j);
                System.out.println(pilota.toString());
            }
        }
    }
}

