package paev2;

import lib.TextIO;

//Luua meetod, mis k�sib kasutajalt t�isarvu etteantud vahemikus senikaua, 
//kuni kasutaja sisestab soovitud vahemikus arvu.
public class Yl3_KasutajaSisestus {
	
	// \r - carrige return, l�heb j�lle rea algusesse.
	public static int kasutajaSisestus(int min, int max)
	{
//		algus:
//		goto algus;  //Mine algus: kohta.     //Kunagi ammu oli goto olemas Java-s.
	
		while (true) {   // "l�putu" ts�kkel
			System.out.format("Palun sisesta arv vahemikus %d .. %d: \n", min, max);
			int sisestus = TextIO.getlnInt();
			
			if (min <= sisestus && sisestus <= max)  // <-- t�ida sobiliku tingimusega
			{
				return sisestus;
			}
			System.out.format("Arv %d ei sobi, palun sisesta uuesti.\n\n", sisestus);
			
//			return sisestus;   //Siis l�heb juba meetodist endast l�puks v�lja.
		}
	}

	public static void main(String[] args) {
		int arv = kasutajaSisestus(1, 10);   //Teeme algul muutujaga, meetod on samuti int t��pi.
		System.out.println("Sisestasid: " + arv);
	}
}
