package paev2;

import lib.TextIO;

//Kirjutada programm, mis k�sib kasutaja k�est t�ish��liku ning t�kib ekraanile 
//"P�dramaja" laulu s�nad, kus k�ik t�ish��likud on asendatud sisestatud t�hega, n�iteks:
//Podrol mojo motso soos,
//vooksost oknost voljo vootob,
//jonos jooksob koogost voost...
//*Kui kasutaja sisestab t�he, mis ei ole t�ish��lik, peab programm h��likut uuesti k�sima.
//*Kui kasutaja sisestab midagi muud kui t�ish��liku, peab programm tr�kkima laulu �iged s�nad, 
//kus t�ish��likud on k�ik omal kohal.
public class Yl13_P6dramaja {
	
	public static boolean onTaishaalik(String taht) {  //char oli siin enne.
		return "aeiou����".contains(String.valueOf(taht));   //Siin String oli sama.
	}
	
	public static String leiaTaishaalikudLaulust(String laul) {
		return "P�dral maja metsa sees...".contains(onTaishaalik(laul));
	}
	
	public static void main(String[] args) 
	{
		//Regulaaravaldisi
//		boolean isChar = character.matches("[a-zA-z]{1}");
//		boolean isDigit = character.matches("\\d{1}"); 
		
		String lugu = "P�dral maja metsa sees...";
		System.out.println("Sisesta t�ish��lik: ");
		String taishaalik = TextIO.getlnString();
		boolean isDigit = taishaalik.matches("\\d{1}");
		
		while (true) {   // "l�putu" ts�kkel
			isDigit = taishaalik.matches("\\d{1}");
			
			//T�ish��liku kontroll
			if (onTaishaalik(taishaalik) == false && isDigit == false) {
				System.out.println("Sisesta t�ish��lik uuesti: ");
				taishaalik = TextIO.getlnString();
			
			//Kui sisestame midagi muud kui t�ish��liku.
			} else if (isDigit == true) {
				System.out.println(lugu);
				break;
			}
			
			else {   //Muul juhul asendame laulus�nad �ra.
				System.out.println("Muuda t�hed!");
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
