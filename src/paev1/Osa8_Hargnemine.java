package paev1;

import lib.TextIO;

public class Osa8_Hargnemine {
	public static void main(String[] args) {
				
		System.out.print("Sisesta �ks arv: ");
	    int arv = TextIO.getlnInt();
		
		if (arv > 10) {
			System.out.println("Arv on suurem kui k�mme ja paaris");
		}
		else if (arv < 10) {
			System.out.println("Arv on v�iksem kui k�mme.");
		}
		else {
			System.out.println("Arv on t�pselt k�mme.");
		}
	}
}
