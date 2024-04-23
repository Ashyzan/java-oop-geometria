package org.lessons.java.geometria;

public class Rettangolo {
	
	// Creare una classe Rettangolo con due attributi interi: base e altezza.
	int base;
	int altezza;
	// Aggiungere un opportuno costruttore con parametri.
	// Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
	
	void calcolaArea() {
		
		int area = base * altezza;
		System.out.println("calcolo l'area del retangolo...");
		System.out.println("l'area è.. " + area);
		
	}
	
	void calcolaPerimetro() {
		
		int perimetro = (base * 2) + (altezza * 2) ;
		System.out.println("calcolo il perimetro del rettangolo...");
		
		System.out.println("il perimetro è.. " + perimetro);
	}
	
	void disegna() {
		
		System.out.println("Base: " + base);
		System.out.println("Altezza: " + altezza);
		int perimetro = (base * 2) + (altezza * 2) ;
		System.out.println("Perimetro: " + perimetro);
		int area = base * altezza;
		System.out.println("area: " + area);
		System.out.println();

	
		for ( int i = 0; i < base; i++ ) {
			System.out.print( "o" );
		
		}
		
		for ( int i = 0; i < altezza-2; i++ ) {
			System.out.println();
			String riga = "o";
			
			for (int j=0; j < base-2; j++) {
				riga = riga.concat(" ");
				
				
			}
			
			System.out.print(riga.concat("o"));
		
		}
		
		
		System.out.println();
		
		for ( int i = 0; i < base; i++ ) {
			System.out.print( "o" );
		
		}
		
	}
	
	
}
 