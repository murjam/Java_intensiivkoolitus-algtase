package paev3;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

//Kirjutada programm, mis küsib kasutaja käest 3 reaalarvu ning trükib need välja sorteeritult (kasvavalt).
//Meetod, mis sorteerib ArrayList-i: Collections.sort().
public class Yl1_SorteeritudArvud {
	
	//Teha ise sorteerimise algoritm.
	public static void sort(ArrayList<Integer> arvud)
	{
		int arvud3 = 3;
		//Võib vaja olla isegi kaks for tsüklit.
		for (int loop = 0; loop < arvud3; loop++) {
			for (int loop2 = 0; loop2 < loop; loop2++) {
				if (loop == loop2) {
					loop--;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		//------ Mite objektorienteeritud kood -----
//		int mitu = 3;
//		
//		ArrayList<Yl2_Sportlased> sportlased = new ArrayList<>();
//		
//		for (int i = 0; i < mitu; i++) {
//			Yl2_Sportlased sportlane = new Yl2_Sportlased(nimi, tulemus);
//			System.out.println("Nimi: ");
//			sportlane.nimi = TextIO.getlnString();
//			System.out.println(sportlane.nimi + " heitis ketast: ");
//			sportlane.tulemus = TextIO.getlnDouble();
//
//			sportlased.add(sportlane);
//		}
//		
//		//Siin võiks kasutada ka enda loodud sorteerimise meetodit.
//		Collections.sort(sportlased);
//		
//		//Välja trükkimine.
//		for (Yl2_Sportlased sportlane : sportlased) {
//			System.out.println(sportlane);
//		}
		
		//------ 1. Ülesande vastus -----
		int mitu1 = 3;
		ArrayList<Double> arvud = new ArrayList<Double>();
		
		System.out.println("Sisesta palun " + mitu1 + " arvu: ");
		
		for (int i = 0; i < mitu1; i++) {
			double arv = TextIO.getlnDouble();
			arvud.add(arv);
		}
		
		Collections.sort(arvud);
		
		//Välja trükkimine Foreach tsükliga ehk käime ArrayListi läbi.
		for (Double arv : arvud) {
			System.out.println(arv + " ");
		}
	}
}
