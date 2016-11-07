package paev2;

import lib.TextIO;

//Luua meetod, mis küsib kasutajalt täisarvu etteantud vahemikus senikaua, 
//kuni kasutaja sisestab soovitud vahemikus arvu.
public class Yl3_KasutajaSisestus {
	
	// \r - carrige return, läheb jälle rea algusesse.
	public static int kasutajaSisestus(int min, int max)
	{
//		algus:
//		goto algus;  //Mine algus: kohta.     //Kunagi ammu oli goto olemas Java-s.
	
		while (true) {   // "lõputu" tsükkel
			System.out.format("Palun sisesta arv vahemikus %d .. %d: \n", min, max);
			int sisestus = TextIO.getlnInt();
			
			if (min <= sisestus && sisestus <= max)  // <-- täida sobiliku tingimusega
			{
				return sisestus;
			}
			System.out.format("Arv %d ei sobi, palun sisesta uuesti.\n\n", sisestus);
			
//			return sisestus;   //Siis läheb juba meetodist endast lõpuks välja.
		}
	}

	public static void main(String[] args) {
		int arv = kasutajaSisestus(1, 10);   //Teeme algul muutujaga, meetod on samuti int tüüpi.
		System.out.println("Sisestasid: " + arv);
	}
}
