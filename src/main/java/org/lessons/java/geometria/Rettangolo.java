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
		System.out.println("calcolo il perimetro del retangolo...");
		
		System.out.println("il perimetro è.. " + perimetro);
	}
}
 