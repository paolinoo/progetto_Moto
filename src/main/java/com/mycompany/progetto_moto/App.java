/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progetto_moto;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Studente
 */
public class App {
    public static void main(String[] args) {
        Scuderia s=new Scuderia();
        Pilota p=new Pilota("nome", "cognome", 4, 2, LocalDate.of(2022, 03, 1));
        Pilota p1=new Pilota("nome", "cognome", 4, 2, LocalDate.of(2022, 03, 1));
        
        s.aggiungiPilota(p);
        Pilota[] elencoPiloti=s.visualizzaPiloti();
        /*
        for(int i=0; i<elencoPiloti.length; i++){
            System.out.println(elencoPiloti[i]);
        }
        */
        System.out.println(s.getPilota(1));
    }
}
