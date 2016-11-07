package paev2;

import lib.TextIO;

//Kirjutada arvu arvamise mäng. Arvuti mõtleb ühe arvu 1..100 ning palub kasutajal selle ära arvata.
//Kui kasutaja pakub väiksemat arvu, öelda, et arv on suurem ja vastupidi.
//Mäng kestab, kuni kasutaja on arvu ära arvanud.
public class Yl11_Arvamismang {
	public static int kasutajaSisestus(int min, int max) {
		
		int suvalineArv = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println(suvalineArv);
		
		System.out.println("Arva ära, mis numbri arvuti mõtles 1..100");
		int minuSisestus = TextIO.getlnInt();
		
		while (minuSisestus != suvalineArv) {
			
			if (minuSisestus > suvalineArv) {
				System.out.println("Arvuti number on väiksem!");
				minuSisestus = TextIO.getlnInt();
			}
			
			else if (minuSisestus < suvalineArv) {
				System.out.println("Arvuti number on suurem!");
				minuSisestus = TextIO.getlnInt();
			}
		}
		return suvalineArv;
	}
	
	public static void main(String[] args) {
		
		System.out.println("\nArvasid ära! \nArvuti number on " + kasutajaSisestus(1, 100));
	}
}
