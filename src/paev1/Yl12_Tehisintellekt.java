package paev1;

import lib.TextIO;

//Kirjutada programm, mis küsib kasutajalt kaks vanust.
//Kui vanuste vahe jääb alla viie aasta, ütleb "sobib";
//kui vanuste vahe on rohkem kui viis aastat, ütleb midagi krõbedat;
//kui vanuste vahe on rohkem kui kümme aastat, ütleb midagi veel krõbedamat.
//Programmi toimimine ei tohi sõltuda vanuste sisestamise järjekorrast!
public class Yl12_Tehisintellekt {
	public static void main(String[] args) {
		
		System.out.println("Sisesta kaks vanust: ");
		int vanus1 = TextIO.getlnInt();
		int vanus2 = TextIO.getlnInt();
		
		int vahe = Math.abs(vanus1 - vanus2);
//		Math.max(vanus1, vanus2);  Siin lihtsalt veel üks meetod Math-lt.
		
		if (vahe < 5) {
			System.out.println("Sobib!");
		}
		
		else if (vahe >= 5 && vahe <= 10) {   //[5..10)
			System.out.println("Ei sobi!");
		}
		
		else {
			System.out.println("Kindlasti ei sobi!");
		}
	}
}
