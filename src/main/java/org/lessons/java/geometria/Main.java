package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	// creare il metodo main(), nel quale chiedete all’utente di inserire, 
		// da console, i valori di base e di altezza con cui istanziare un nuovo Rettangolo. 
		// Dopo averlo istanziato, stampate a video il perimetro e l’area.
	
	public static void main(String[] args) {
		
		System.out.println("Benvenuto nell'area geometria.");
		/*
		 Rettangolo rettangolo1 = new Rettangolo();
		rettangolo1.base = 20;
		rettangolo1.altezza = 40;
		rettangolo1.calcolaArea();
		rettangolo1.calcolaPerimetro();
		rettangolo1.disegna();*/
		
		
		// metodo Scanner permette di prendere un input dalla tastiera
				Scanner input = new Scanner(System.in);
				// apre il field per inserimento dati utente
				System.out.println("Ciao, inserisci il valore dell'area del rettangolo");
			
				
				// attribuisce alla variabile nome l'input inserito dall'utente
				Rettangolo rettangoloUtente = new Rettangolo();
				
				System.out.println("inserisci la base..");
				
				int baseRettangoloUtente = input.nextInt();
				//System.out.println("La base del tuo rettangolo è " + baseRettangoloUtente);
				System.out.println("inserisci l'altezza..");
				int altezzaRettangoloUtente = input.nextInt();
				//System.out.println("L'altezza del tuo rettangolo è " + baseRettangoloUtente);
				
				
				rettangoloUtente.base = baseRettangoloUtente;
				rettangoloUtente.altezza = altezzaRettangoloUtente;
				rettangoloUtente.calcolaArea();
				rettangoloUtente.calcolaPerimetro();
				rettangoloUtente.disegna();
				
				
				
	}

	
	
}

