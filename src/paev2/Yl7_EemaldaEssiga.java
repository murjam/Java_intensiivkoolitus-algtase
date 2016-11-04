package paev2;

import java.util.Arrays;

//Kirjutada programm, mis eemaldaks etteantud teksti seest k�ik
//'s'-t�hte ('S' k.a) sisaldavad s�nad.
//(i)K�ige lihtsam on seda lahendada, kui teha tekst s�nade massiiviks.
public class Yl7_EemaldaEssiga {
	public static void main(String[] args) {

//		if (-1 != "mingi tekst".indexOf("s")) {	   //V�imalused!
//		}
//		if ("mingi tekst".contains("s")) {
//		}
		
		//Algul eraldame t�hikute juurest s�nad, et saada eraldatud s�nad. Tehtud!
		String[] sonad = "tekst Mitme Sonaga siis".split(" ");  //([A-Z]+)-([A-Z]+) (?<=[a-z])
		System.out.format(Arrays.toString(sonad) + "\n");
		
		//K�ime k�ik massiivi elemendid l�bi.
		for (int i = 0; i < sonad.length; i++) {
			//Kui neis s�nades on s,S.
			if (Arrays.toString(sonad).contains("s")) {   //(?=[s,S])
				//Siis prindime v�lja vaid need s,S t�hti sisaldavad s�nad.
				System.out.println(i);  //i- testimiseks
			} else {
				//Ei prindi midagi v�lja.
			}
		}
	}
}
