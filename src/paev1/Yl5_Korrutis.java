package paev1;

import lib.TextIO;

/*Kirjutada programm, mis küsib kasutajalt TextIO klassi abil kaks arvu ja väljastab nende korrutise.*/
public class Yl5_Korrutis {
	public static void main(String[] args) {

		System.out.print("Sisesta arv 1: ");
		int arv1 = TextIO.getlnInt();

		System.out.print("Sisesta arv 2: ");
		int arv2 = TextIO.getlnInt();

		int korrutis = arv1 * arv2;
		System.out.println("Nende arvude korrutis on " + korrutis);
	}

}