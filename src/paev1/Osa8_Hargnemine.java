package paev1;

import lib.TextIO;

public class Osa8_Hargnemine {
	public static void main(String[] args) {
				
		System.out.print("Sisesta üks arv: ");
	    int arv = TextIO.getlnInt();
		
		if (arv > 10) {
			System.out.println("Arv on suurem kui kümme ja paaris");
		}
		else if (arv < 10) {
			System.out.println("Arv on väiksem kui kümme.");
		}
		else {
			System.out.println("Arv on täpselt kümme.");
		}
	}
}
