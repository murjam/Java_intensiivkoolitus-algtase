package paev1;

import lib.TextIO;

//Programm küsib kaalutud keskhinde ja lõputöö hinde. Kui keskhinne on suurem kui 4.5 ja lõputöö 
//hinne on 5 siis ütleb "Jah saad Cum Laude!" Muul juhul ütleb "Ei saa!"
//Täiendus: programm ei tohi aktsepteerida vigaseid hindeid (üle 5-e, negatiivseid jne). 
//Vigase hinde puhul tuleb anda veateade.
public class Yl10_CumLaudeDetektor {
	public static void main(String[] args) {
		
		System.out.print("Sisesta kaalutud keskmine hinne: ");
		double kaalutudKesk = TextIO.getlnDouble();
		
		//Veatöötlus ja veateade, meil vaja while, kuna asi peab tsüklisse jääma.
		while (kaalutudKesk < 0 || kaalutudKesk > 5) {
			System.out.print("Sisesta kaalutud keskmine hinne uuesti: ");
			kaalutudKesk = TextIO.getlnDouble();
		}
		
		System.out.print("Sisesta lõputöö hinne: ");
		int l6putooHinne = TextIO.getlnInt();
		
		//Veatöötlus ja veateade, meil vaja while, kuna asi peab tsüklisse jääma.
		while (l6putooHinne > 5 || l6putooHinne < 0) {
			System.out.print("Sisesta lõputöö hinne uuesti: ");
			l6putooHinne = TextIO.getlnInt();
		}
		
		System.out.println("\nKaalutud keskmine hinne on " + kaalutudKesk + " ja lõputöö hinne on " + l6putooHinne);
		
		if (kaalutudKesk >= 4.5 && l6putooHinne == 5) {
			System.out.println("Jah, saad Cum Laude!");

		} else {
			System.out.println("Sa ei saa Cum Laudet!");
		}
	}
}
