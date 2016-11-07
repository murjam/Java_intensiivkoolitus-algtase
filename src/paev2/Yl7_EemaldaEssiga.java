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
		
		//Algul eraldame t�hikute juurest s�nad, et saada eraldatud s�nad.
		String[] sonadEraldatud = "tekst Mitme S�naga siis tulnud".split(" ");  //(?=[s,S]) (?<=[a-z])
		System.out.format(Arrays.toString(sonadEraldatud) + "\n\n");
		
		//K�ime k�ik massiivi elemendid l�bi.
		for (String sona : sonadEraldatud) {
			if (sona.contains("s") || sona.contains("S")) {
			} else {
				System.out.print(sona + " ");
			}
		}

	}
}