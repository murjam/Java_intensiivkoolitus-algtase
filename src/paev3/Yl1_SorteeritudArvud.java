package paev3;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

//Kirjutada programm, mis küsib kasutaja käest 3 reaalarvu ning trükib need välja sorteeritult (kasvavalt).
//Meetod, mis sorteerib ArrayList-i: Collections.sort().
public class Yl1_SorteeritudArvud {
	
	//Teha ise sorteerimise algoritm. Näpuharjutus.
	public static void sort(ArrayList<Integer> arvud)
	{
		//Võib vaja olla isegi kaks for tsüklit.
//		for (int i = 0; i < args.length; i++) {
//			
//		}
	}
	
	public static void main(String[] args) {
		
//		//------ Mite objektorienteeritud kood -----
		int mitu = 3;
		
		ArrayList<Yl2_Sportlased> sportlased = new ArrayList<>();
		
		for (int i = 0; i < mitu; i++) {
			Yl2_Sportlased sportlane = new Yl2_Sportlased(nimi, tulemus);
			System.out.println("Nimi: ");
			sportlane.nimi = TextIO.getlnString();
			System.out.println(sportlane.nimi + " heitis ketast: ");
			sportlane.tulemus = TextIO.getlnDouble();

			sportlased.add(sportlane);
		}
		
		Collections.sort(sportlased);;
		
		//Välja trükkimine.
		for (Yl2_Sportlased sportlane : sportlased) {
			System.out.println(sportlane);
		}
		
		//------ Mite nii objektorienteeritud kood -----
//		System.out.println("Sisesta palun " + mitu + " arvu");
//		
//		ArrayList<Double> arvud = new ArrayList<Double>();
//		
//		for (int i = 0; i < mitu; i++) {
//			double arv = TextIO.getlnDouble();
//			arvud.add(arv);
//		}
//		
//		Collections.sort(arvud);
//		
//		//Välja trükkimine.
//		for (Double arv : arvud) {
//			System.out.println(arv + " ");
//		}
	}

}
