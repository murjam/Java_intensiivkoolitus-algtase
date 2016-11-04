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
	
	public static boolean onTaishaalik(String taht) {  //char oli siin enne.
		return "aeiouõäöü".contains(String.valueOf(taht));   //Siin String oli sama.
	}
	
	public static String leiaTaishaalikudLaulust(String laul) {
		return "Põdral maja metsa sees...".contains(onTaishaalik(laul));
	}
	
	public static void main(String[] args) 
	{
		//Regulaaravaldisi
//		boolean isChar = character.matches("[a-zA-z]{1}");
//		boolean isDigit = character.matches("\\d{1}"); 
		
		String lugu = "Põdral maja metsa sees...";
		System.out.println("Sisesta täishäälik: ");
		String taishaalik = TextIO.getlnString();
		boolean isDigit = taishaalik.matches("\\d{1}");
		
		while (true) {   // "lõputu" tsükkel
			isDigit = taishaalik.matches("\\d{1}");
			
			//Täishääliku kontroll
			if (onTaishaalik(taishaalik) == false && isDigit == false) {
				System.out.println("Sisesta täishäälik uuesti: ");
				taishaalik = TextIO.getlnString();
			
			//Kui sisestame midagi muud kui täishääliku.
			} else if (isDigit == true) {
				System.out.println(lugu);
				break;
			}
			
			else {   //Muul juhul asendame laulusõnad ära.
				System.out.println("Muuda tähed!");
				System.out.format(lugu.replace(leiaTaishaalikudLaulust(lugu), taishaalik));
				break;
			}
		}
		
		//replace
//		System.out.println(onTaishaalik('a'));
//		System.out.println(onTaishaalik('b'));
//		System.out.println(onTaishaalik('c'));
		
	}
}
