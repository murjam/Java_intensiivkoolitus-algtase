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
		
		//Algul eraldame tühikute juurest sõnad, et saada eraldatud sõnad. Tehtud!
		String[] sonad = "tekst Mitme Sonaga siis".split(" ");  //([A-Z]+)-([A-Z]+) (?<=[a-z])
		System.out.format(Arrays.toString(sonad) + "\n");
		
		//Käime kõik massiivi elemendid läbi.
		for (int i = 0; i < sonad.length; i++) {
			//Kui neis sõnades on s,S.
			if (Arrays.toString(sonad).contains("s")) {   //(?=[s,S])
				//Siis prindime välja vaid need s,S tähti sisaldavad sõnad.
				System.out.println(i);  //i- testimiseks
			} else {
				//Ei prindi midagi välja.
			}
		}
	}
}
