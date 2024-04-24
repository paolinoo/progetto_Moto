/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto_moto;

/**
 *
 * @author Studente
 */
public class Pilota {
    
    private String nome;
    private String cognome;
    private int eta;
    private int altezza;
    private String nazione;

    public Pilota(String nome, String cognome, int eta, int altezza, String nazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.altezza = altezza;
        this.nazione = nazione;
    }
    
    public Pilota(Pilota pilota)
    {
        this.nome=pilota.getNome();
        this.cognome=pilota.getCognome();
        this.altezza=pilota.getAltezza();
        this.eta=pilota.getEta();
        this.nazione=pilota.getNazione();
                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    @Override
    public String toString() {
        return "Pilota{" + "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", altezza=" + altezza + ", nazione=" + nazione + '}';
    }
    
    
}
