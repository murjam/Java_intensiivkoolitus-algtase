package paev2;

import lib.TextIO;

public class Yl3Sisestus {

	// \r - carrige return, läheb jälle rea algusesse
	public static int kasutajaSisestus(int min, int max)
	{
//		algus:
//		goto algus;  //Mine algus: kohta.     //Kunagi ammu oli goto olemas.
	
		while (true) {
			System.out.format("Palun sisesta arv vahemikus %d .. %d: \n", min, max);
			
			int sisestus = TextIO.getlnInt();
			
			if (min <= sisestus && sisestus <= max)
			{
				return sisestus;
			}
			System.out.format("Arv %d ei sobi, palun sisesta uuesti.\n\n", sisestus);
			
//			return sisestus;
		}
	}

	public static void main(String[] args) {
		int arv = kasutajaSisestus(1, 10);
		System.out.println("Sisestasid: " + arv);
	}
}
