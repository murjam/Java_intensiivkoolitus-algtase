package paev1;

import lib.TextIO;

//Kirjutada programm, mis küsib kasutajalt arvu ning trükib ekraanile, vastavalt kas 
//arv on paaris või paaritu. Paaris arvu kahega jagamise jääk (arv % 2) on 0.
public class Yl9_PaarisPaaritu {
	public static void main(String[] args) {
		
//		String a = "tere";
//		if ("tere" == a){   //Stringide võrdsust ei tohiks nii kontrollida, mäluaadresside teema.
//		}
			
		System.out.print("Sisesta üks arv: ");
		int arv1 = TextIO.getlnInt();

		String paarsus;
		
		if (0 == arv1 % 2) {
		    paarsus = "paaris";
		}
		else {
		    paarsus = "paaritu";
		}
		
		System.out.format("Sisestatud arv on %s.\n", paarsus);
		//----Teine lühem versioon, koos if-iga, milleks on + ?---//
		System.out.format("Sisestatud arv on %s.", 0 == arv1 % 2 ? "paaris" : "paaritu");
	}
}
