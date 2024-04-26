/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto_moto;

import java.time.LocalDate;

/**
 *
 * @author Studente
 */
public class Pilota {
    
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private int altezza;
    private String nazione;
    private int idPilota;

    public Pilota(String nome, String cognome, int eta, int altezza, String nazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.altezza = altezza;
        this.nazione = nazione;
        this.idPilota=idPilota;
    }
    
    public Pilota(Pilota pilota)
    {
        this.nome=pilota.getNome();
        this.cognome=pilota.getCognome();
        this.altezza=pilota.getAltezza();
        this.nazione=pilota.getNazione();
    }
    
    public int getIDPilota()
    {
        return idPilota;
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

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
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
        return "Pilota{" + "nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", altezza=" + altezza + ", nazione=" + nazione + '}';
    }
    
    }

