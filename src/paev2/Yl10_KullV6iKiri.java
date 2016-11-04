package paev2;

import lib.TextIO;

//Kirjutada programm, mis k�sib kasutajalt, kas tuleb kull v�i kiri, 
//seej�rel "viskab m�nti" ning teatab, kas kasutaja arvas �igesti v�i valesti.
//(i)Lihtsam on opereerida arvude, kui tekstidega, v�id kasutajalt k�sida teksti asemel arvu.
public class Yl10_KullV6iKiri {
	public static void main(String[] args) {
		
		int min = 0;
		int max = 1;
		
		System.out.println("Sisesta, kas tuleb kull (0) v�i kiri (1)");
		int arvSisestatud = TextIO.getlnInt();
		
		//L�hidalt randomi genereerimine.
		int tulemusSuvaline = (int) (Math.random() * (max - min + 1)) + min;  //Castime int-i.
		
		if (arvSisestatud == tulemusSuvaline) {
			System.out.print("\nArvasid �igesti! \nTuli " + tulemusSuvaline);
		} else {
			System.out.print("\nArvasid valesti! \nTuli " + tulemusSuvaline); 
		}
		System.out.format(" ehk %s", 0 == tulemusSuvaline % 2 ? "kull." : "kiri.");
	}
}
