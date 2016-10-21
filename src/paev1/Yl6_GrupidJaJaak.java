package paev1;

import lib.TextIO;

//Kirjutada programm, mis küsib inimeste arvu ja grupi suuruse ning väljastab mitu 
//täisgruppi nendest inimestest moodustada saab (täisarvuline jagatis) ja mitu inimest üle jääb.
public class Yl6_GrupidJaJaak {
	public static void main(String[] args) {
		
		System.out.print("Sisesta inimeste arv: ");
		int inimesi = TextIO.getlnInt();

		System.out.print("Sisesta grupi suurus: ");
		int grupiSuurus = TextIO.getlnInt();
		
		//4 % 2 = 0      //Tehtega saab leida, kas arv on paaris.
		//7 % 3 = 1
		//10 % 4 = 2
		//5 mod 3 
		//34354384 % 100 = 84
		
		int gruppe = inimesi / grupiSuurus;   //Annab lihtsalt jagamise tulemuse.
		int jaak = inimesi % grupiSuurus;     //jaak == 3 % ehk kahe arvu jagatise jääk.
		System.out.println("Täisgruppe on " + gruppe);
		System.out.println("Üle jääb " + jaak + " inimest.");
	}

}
