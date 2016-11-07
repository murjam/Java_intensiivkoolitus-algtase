package paev2;

import lib.TextIO;

//Kirjutada programm, mis küsib kasutaja käest täishääliku ning tükib ekraanile 
//"Põdramaja" laulu sõnad, kus kõik täishäälikud on asendatud sisestatud tähega, näiteks:
//Podrol mojo motso soos,
//vooksost oknost voljo vootob,
//jonos jooksob koogost voost...
//*Kui kasutaja sisestab tähe, mis ei ole täishäälik, peab programm häälikut uuesti küsima.
//*Kui kasutaja sisestab midagi muud kui täishääliku, peab programm trükkima laulu õiged sõnad, 
//kus täishäälikud on kõik omal kohal.
public class Yl13_P6dramaja {
	
	//Meetod, mis annab vastuse, kas on täishäälik või mitte.
	public static boolean onTaishaalik(String taht) {  //char oli siin enne.
		return "aeiouõäöü".contains(String.valueOf(taht));   //Siin String oli sama.
	}
	
	//Asendab täishäälikud laulu sees
	public static String asendaTaishaalikud(String laul, char taht) {
		
//		laul = "Põdral maja metsa sees, \nväiksest aknast välja vaatab...";
		char laulCharTyyp = laul.charAt(0); 
		
		System.out.print("Sisesta täishäälik: ");
		String taishaalik = TextIO.getlnString();
		
		boolean isDigit = taishaalik.matches("\\d{1}");  //Kas on täht? kontrollimine.
		taht = taishaalik.charAt(0);   //Teeme String-i char-ks, kuna replace meetod nõuab seda.
		
		while (true) {   // "lõputu" tsükkel
			isDigit = taishaalik.matches("\\d{1}");  //Tsükli pärast peame siin uuesti väärtustama.
			
			//Täishääliku kontroll
			if (onTaishaalik(taishaalik) == false && isDigit == false) { // 
				System.out.print("Sisesta täishäälik uuesti: ");
				taishaalik = TextIO.getlnString();
				
			//Kui sisestame numbri täishääliku asemel.
			} else if (isDigit == true) {
				System.out.println("Prindime välja kogu laulu!");   //Prindime välja kogu laulu.
				return laul;   //Katkestame programmi töö.
				
			} else if (onTaishaalik(taishaalik) == true){   //Muul tingimusel asendame laulusõnad ära.
				System.out.println("Muuda tähed!");
				String tulemusAsendatud = laul.replace(laulCharTyyp, taht);
				return tulemusAsendatud;
			}
		}
		//Kui laul contains taishaalik siis asenda täishäälikud.
		//Annab tulemuseks vastuse mingisuguse kas tavalise laulu või asendatud laulu.
		
//		boolean boolll = true;
//		String str = String.valueOf(boovar);
		
//		return laul.contains(String.valueOf(onTaishaalik(laul)));
	}
	//Main-is trükime välja vastuse ja 
	
	public static void main(String[] args) 
	{
		String lugu = "Põdral maja metsa sees, \nväiksest aknast välja vaatab...";
		System.out.println(asendaTaishaalikud(lugu,'a'));
		
		//Regulaaravaldisi
//		boolean isChar = character.matches("[a-zA-z]{1}");
//		boolean isDigit = character.matches("\\d{1}"); 
		
		//replace
//		System.out.println(onTaishaalik('a'));
//		System.out.println(onTaishaalik('b'));
//		System.out.println(onTaishaalik('c'));
		
	}
}
