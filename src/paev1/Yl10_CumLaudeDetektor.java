package paev1;

import lib.TextIO;

//Programm k�sib kaalutud keskhinde ja l�put�� hinde. Kui keskhinne on suurem kui 4.5 ja l�put�� 
//hinne on 5 siis �tleb "Jah saad Cum Laude!" Muul juhul �tleb "Ei saa!"
//T�iendus: programm ei tohi aktsepteerida vigaseid hindeid (�le 5-e, negatiivseid jne). 
//Vigase hinde puhul tuleb anda veateade.
public class Yl10_CumLaudeDetektor {
	public static void main(String[] args) {
		
		System.out.print("Sisesta kaalutud keskmine hinne: ");
		double kaalutudKesk = TextIO.getlnDouble();
		
		//Veat��tlus ja veateade, meil vaja while, kuna asi peab ts�klisse j��ma.
		while (kaalutudKesk < 0 || kaalutudKesk > 5) {
			System.out.print("Sisesta kaalutud keskmine hinne uuesti: ");
			kaalutudKesk = TextIO.getlnDouble();
		}
		
		System.out.print("Sisesta l�put�� hinne: ");
		int l6putooHinne = TextIO.getlnInt();
		
		//Veat��tlus ja veateade, meil vaja while, kuna asi peab ts�klisse j��ma.
		while (l6putooHinne > 5 || l6putooHinne < 0) {
			System.out.print("Sisesta l�put�� hinne uuesti: ");
			l6putooHinne = TextIO.getlnInt();
		}
		
		System.out.println("\nKaalutud keskmine hinne on " + kaalutudKesk + " ja l�put�� hinne on " + l6putooHinne);
		
		if (kaalutudKesk >= 4.5 && l6putooHinne == 5) {
			System.out.println("Jah, saad Cum Laude!");

		} else {
			System.out.println("Sa ei saa Cum Laudet!");
		}
	}
}
