package paev1;

import lib.TextIO;

public class Yl9_PaarisPaaritu {
	public static void main(String[] args) {
		
		String a = "tere";
		
		if ("tere" == a){   //Stringide v�rdsust ei tohiks nii kontrollida, m�luaadresside teema.
			
		}
			
		System.out.println("Sisesta �ks arv");
		int arv1 = TextIO.getlnInt();

		String paarsus;
		if (0 == arv1 % 2) {
		    paarsus = "paaris";
		}
		else {
		    paarsus = "paaritu";
		}
		System.out.format("Sisestatud arv on %s.", paarsus);
		
		//--------Teine versioon--------------
		System.out.println("Sisesta �ks arv");
		int arv2 = TextIO.getlnInt();

		System.out.format("Sisestatud arv on %s.",
				0 == arv2 % 2 ? "paaris" : "paaritu");
	}

}
