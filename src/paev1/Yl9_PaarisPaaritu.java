package paev1;

import lib.TextIO;

//Kirjutada programm, mis k�sib kasutajalt arvu ning tr�kib ekraanile, vastavalt kas 
//arv on paaris v�i paaritu. Paaris arvu kahega jagamise j��k (arv % 2) on 0.
public class Yl9_PaarisPaaritu {
	public static void main(String[] args) {
		
//		String a = "tere";
//		if ("tere" == a){   //Stringide v�rdsust ei tohiks nii kontrollida, m�luaadresside teema.
//		}
			
		System.out.print("Sisesta �ks arv: ");
		int arv1 = TextIO.getlnInt();

		String paarsus;
		
		if (0 == arv1 % 2) {
		    paarsus = "paaris";
		}
		else {
		    paarsus = "paaritu";
		}
		
		System.out.format("Sisestatud arv on %s.\n", paarsus);
		//----Teine l�hem versioon, koos if-iga, milleks on + ?---//
		System.out.format("Sisestatud arv on %s.", 0 == arv1 % 2 ? "paaris" : "paaritu");
	}
}
