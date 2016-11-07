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
	
	//Meetod, mis annab vastuse, kas on t�ish��lik v�i mitte.
	public static boolean onTaishaalik(String taht) {  //char oli siin enne.
		return "aeiou����".contains(String.valueOf(taht));   //Siin String oli sama.
	}
	
	//Asendab t�ish��likud laulu sees
	public static String asendaTaishaalikud(String laul, char taht) {
		
//		laul = "P�dral maja metsa sees, \nv�iksest aknast v�lja vaatab...";
		char laulCharTyyp = laul.charAt(0); 
		
		System.out.print("Sisesta t�ish��lik: ");
		String taishaalik = TextIO.getlnString();
		
		boolean isDigit = taishaalik.matches("\\d{1}");  //Kas on t�ht? kontrollimine.
		taht = taishaalik.charAt(0);   //Teeme String-i char-ks, kuna replace meetod n�uab seda.
		
		while (true) {   // "l�putu" ts�kkel
			isDigit = taishaalik.matches("\\d{1}");  //Ts�kli p�rast peame siin uuesti v��rtustama.
			
			//T�ish��liku kontroll
			if (onTaishaalik(taishaalik) == false && isDigit == false) { // 
				System.out.print("Sisesta t�ish��lik uuesti: ");
				taishaalik = TextIO.getlnString();
				
			//Kui sisestame numbri t�ish��liku asemel.
			} else if (isDigit == true) {
				System.out.println("Prindime v�lja kogu laulu!");   //Prindime v�lja kogu laulu.
				return laul;   //Katkestame programmi t��.
				
			} else if (onTaishaalik(taishaalik) == true){   //Muul tingimusel asendame laulus�nad �ra.
				System.out.println("Muuda t�hed!");
				String tulemusAsendatud = laul.replace(laulCharTyyp, taht);
				return tulemusAsendatud;
			}
		}
		//Kui laul contains taishaalik siis asenda t�ish��likud.
		//Annab tulemuseks vastuse mingisuguse kas tavalise laulu v�i asendatud laulu.
		
//		boolean boolll = true;
//		String str = String.valueOf(boovar);
		
//		return laul.contains(String.valueOf(onTaishaalik(laul)));
	}
	//Main-is tr�kime v�lja vastuse ja 
	
	public static void main(String[] args) 
	{
		String lugu = "P�dral maja metsa sees, \nv�iksest aknast v�lja vaatab...";
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
