package paev1;

import lib.TextIO;

//Kirjutada programm, mis k�sib inimeste arvu ja grupi suuruse ning v�ljastab mitu 
//t�isgruppi nendest inimestest moodustada saab (t�isarvuline jagatis) ja mitu inimest �le j��b.
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
		int jaak = inimesi % grupiSuurus;     //jaak == 3 % ehk kahe arvu jagatise j��k.
		System.out.println("T�isgruppe on " + gruppe);
		System.out.println("�le j��b " + jaak + " inimest.");
	}

}
