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
    private int idPilota;
    private static int nextId=1;

    public Pilota(String nome, String cognome, int eta, int altezza,LocalDate dataNascita,int IdPilota) {
        idPilota=nextId;
        setNome(nome);
        setCognome(cognome);
        setAltezza(altezza);
        setDataNascita(dataNascita);
        nextId++;
    }
    
    public Pilota(Pilota pilota)
    {
        this.nome=pilota.getNome();
        this.cognome=pilota.getCognome();
        this.altezza=pilota.getAltezza();
        this.dataNascita=pilota.getDataNascita();
    }
    
    public int getID()
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

    @Override
    public String toString() {
        return "Pilota{" + "nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", altezza=" + altezza + '}';
    }
    
    }

