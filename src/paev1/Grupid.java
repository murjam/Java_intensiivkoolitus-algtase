package paev1;

import lib.TextIO;
import paev2.Yl1ArvuTabel;

public class Grupid {
	public static void main(String[] args) {
		
		Yl1ArvuTabel.trykiTabel(1, 2);
		System.out.println("Sisesta inimeste arv");
		int inimesi = TextIO.getlnInt();

		System.out.println("Sisesta grupi suurus");
		int grupiSuurus = TextIO.getlnInt();
		
		//4 % 2 = 0      //Tehtega saab leida kas arv on paaris.
		//7 % 3 = 1
		//10 % 4 = 2
		//5 mod 3 
		//34354384 % 100 = 84
		
		int gruppe = inimesi / grupiSuurus;   //Annab lihtsalt jagamise tulemuse.
		int jaak = inimesi % grupiSuurus;    // jaak == 3 %  kahe arvu jagatise j‰‰k
		System.out.println("T‰isgruppe on: " + jaak);
	}

}
