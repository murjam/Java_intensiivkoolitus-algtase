package paev2;

import lib.TextIO;

//Kirjutada arvu arvamise m�ng. Arvuti m�tleb �he arvu 1..100 ning palub kasutajal selle �ra arvata.
//Kui kasutaja pakub v�iksemat arvu, �elda, et arv on suurem ja vastupidi.
//M�ng kestab, kuni kasutaja on arvu �ra arvanud.
public class Yl11_Arvamismang {
	public static int kasutajaSisestus(int min, int max) {
		
		int suvalineArv = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println(suvalineArv);
		
		System.out.println("Arva �ra, mis numbri arvuti m�tles 1..100");
		int minuSisestus = TextIO.getlnInt();
		
		while (minuSisestus != suvalineArv) {
			
			if (minuSisestus > suvalineArv) {
				System.out.println("Arvuti number on v�iksem!");
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
		
		System.out.println("\nArvasid �ra! \nArvuti number on " + kasutajaSisestus(1, 100));
	}
}
