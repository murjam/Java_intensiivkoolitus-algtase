package paev2;

import lib.TextIO;

//Kirjutada programm, mis küsib kasutajalt, kas tuleb kull või kiri, 
//seejärel "viskab münti" ning teatab, kas kasutaja arvas õigesti või valesti.
//(i)Lihtsam on opereerida arvude, kui tekstidega, võid kasutajalt küsida teksti asemel arvu.
public class Yl10_KullV6iKiri {
	public static void main(String[] args) {
		
		int min = 0;
		int max = 1;
		
		System.out.println("Sisesta, kas tuleb kull (0) või kiri (1)");
		int arvSisestatud = TextIO.getlnInt();
		
		//Lühidalt randomi genereerimine.
		int tulemusSuvaline = (int) (Math.random() * (max - min + 1)) + min;  //Castime int-i.
		
		if (arvSisestatud == tulemusSuvaline) {
			System.out.print("\nArvasid õigesti! \nTuli " + tulemusSuvaline);
		} else {
			System.out.print("\nArvasid valesti! \nTuli " + tulemusSuvaline); 
		}
		System.out.format(" ehk %s", 0 == tulemusSuvaline % 2 ? "kull." : "kiri.");
	}
}
