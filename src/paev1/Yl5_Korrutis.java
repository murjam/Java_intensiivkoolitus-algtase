package paev1;

import lib.TextIO;

public class Yl5_Korrutis {
	public static void main(String[] args) {

		System.out.println("Sisesta arv 1");
		int arv1 = TextIO.getlnInt();

		System.out.println("Sisesta arv 2");
		int arv2 = TextIO.getlnInt();

		int ruut = arv1 * arv2;
		System.out.println("Nende arvude korrutis on " + ruut);
		
	}
}