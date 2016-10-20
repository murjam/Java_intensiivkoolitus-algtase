package paev_1;

import lib.TextIO;

public class Yl7_NimePikkus {     //Suur algustäht, et ta on klass tüüp.
	public static void main(String[] args) {
		
		System.out.println("Palun sisesta oma nimi ");
		String nimi = TextIO.getlnString();
//		String nimiTyhikuta = nimi.replace(" ", "");
		
//		int pikkus = nimi.length();    //Sa ei saa Java-s tekste muuta.
		System.out.println("Sinu nimes on " + nimi.replace(" ", "").length() + " tähte.");   //String on primitiiv tüüp ehk ta on objekt.
		System.out.format("Sinu nimes on %d tähte.", nimi.replace(" ", "").length());
	}

}
