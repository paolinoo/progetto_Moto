/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilita;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Menu
{
    private String[] elencoVoci;
    private int numeroVoci;
    /**
     * Costruttore
     * @param elencoVoci Rappresenta l'elenco di voci di cui è 
     * costituito il menu.
     */
    public Menu(String[] elencoVoci)
    {
	numeroVoci=elencoVoci.length;
	this.elencoVoci=new String[numeroVoci];
	for(int i=0;i<numeroVoci;i++)
	    this.elencoVoci[i]=elencoVoci[i];
    }
    /**
     * Visualizza le voci del menu
     */
    public void visualizzaMenu()
    {
	System.out.println("MENU:");
	for(int i=0;i<numeroVoci;i++)
	    System.out.println(elencoVoci[i]);
    }
 
    public int sceltaMenu()
    {
	String inputUtente;
	int sceltaUtente=0;
	boolean inputUtenteOK=true;
	
	do{
	    //Scanner tastiera=new Scanner(System.in);
            ConsoleInput tastiera=new ConsoleInput();
	    inputUtenteOK=true;
	    visualizzaMenu();
	    System.out.print("Scelta --> ");
	    //inputUtente=tastiera.nextLine;
            
            try
            {
                sceltaUtente=tastiera.readInt();
                //verifico se il numero inserito è compreso nelle voci del menu              
                if(sceltaUtente<0 || sceltaUtente>numeroVoci-1)
                {
                     inputUtenteOK=false;
                     System.out.println("Voce non prevista");
                }  
            } 
            catch (IOException ex) 
            {
                System.out.println("Impossibile leggere da tastiera!");
            } 
            catch (NumberFormatException ex) 
            {
                System.out.println("Formato input non corretto");
                inputUtenteOK=false;
            }
	}while(!inputUtenteOK);
	return sceltaUtente;
    }
}