package paev1;

import lib.TextIO;

//Kirjutada programm, mis k�sib kasutajalt kaks vanust.
//Kui vanuste vahe j��b alla viie aasta, �tleb "sobib";
//kui vanuste vahe on rohkem kui viis aastat, �tleb midagi kr�bedat;
//kui vanuste vahe on rohkem kui k�mme aastat, �tleb midagi veel kr�bedamat.
//Programmi toimimine ei tohi s�ltuda vanuste sisestamise j�rjekorrast!
public class Yl12_Tehisintellekt {
	public static void main(String[] args) {
		
		System.out.println("Sisesta kaks vanust: ");
		int vanus1 = TextIO.getlnInt();
		int vanus2 = TextIO.getlnInt();
		
		int vahe = Math.abs(vanus1 - vanus2);
//		Math.max(vanus1, vanus2);  Siin lihtsalt veel �ks meetod Math-lt.
		
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
