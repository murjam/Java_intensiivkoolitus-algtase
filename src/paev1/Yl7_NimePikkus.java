package paev1;

import lib.TextIO;

public class Yl7_NimePikkus { // Suur algust�ht, et ta on klass t��p.
	public static void main(String[] args) {

		System.out.print("Sisesta oma nimi: ");
		String nimi = TextIO.getlnString();
		// String nimiTyhikuta = nimi.replace(" ", ""); <- et v�listada t�hikud.

		// int pikkus = nimi.length(); //Sa ei saa Java-s tekste muuta.
		System.out.println("Sinu nimes on " + nimi.replace(" ", "").length() + " t�hte.");
		// String on primitiiv t��p ehk ta on objekt.
		System.out.format("Sinu nimes on %d t�hte.", nimi.replace(" ", "").length()); // Teine v�imalus.
	}
}
