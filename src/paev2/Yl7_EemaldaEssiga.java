package paev2;

import java.util.Arrays;

//Kirjutada programm, mis eemaldaks etteantud teksti seest kõik
//'s'-tähte ('S' k.a) sisaldavad sõnad.
//(i)Kõige lihtsam on seda lahendada, kui teha tekst sõnade massiiviks.
public class Yl7_EemaldaEssiga {
	public static void main(String[] args) {

//		if (-1 != "mingi tekst".indexOf("s")) {	   //Võimalused!
//		}
//		if ("mingi tekst".contains("s")) {
//		}
		
		//Algul eraldame tühikute juurest sõnad, et saada eraldatud sõnad.
		String[] sonadEraldatud = "tekst Mitme Sõnaga siis tulnud".split(" ");  //(?=[s,S]) (?<=[a-z])
		System.out.format(Arrays.toString(sonadEraldatud) + "\n\n");
		
		//Käime kõik massiivi elemendid läbi.
		for (String sona : sonadEraldatud) {
			if (sona.contains("s") || sona.contains("S")) {
			} else {
				System.out.print(sona + " ");
			}
		}

	}
}