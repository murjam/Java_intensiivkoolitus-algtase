package paev3;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class ArvudJarjest {
	
	//Teha ise sorteerimise algoritm. N�puharjutus.
	public static void sort(ArrayList<Integer> arvud)
	{
		//V�ib vaja olla isegi kaks for ts�klit.
//		for (int i = 0; i < args.length; i++) {
//			
//		}
	}
	
	public static void main(String[] args) {
		
		//------ Mite objektorienteeritud kood -----
		int mitu = 3;
		
		ArrayList<Sportlane> sportlased = new ArrayList<>();
		
		for (int i = 0; i < mitu; i++) {
			Sportlane sportlane = new Sportlane(nimi, tulemus);
			System.out.println("Nimi: ");
			sportlane.nimi = TextIO.getlnString();
			System.out.println(sportlane.nimi + " heitis ketast: ");
			sportlane.tulemus = TextIO.getlnDouble();

			sportlased.add(sportlane);
		}
		
		Collections.sort(sportlased);;
		
		//V�lja tr�kkimine.
		for (Sportlane sportlane : sportlased) {
			System.out.println(sportlane);
		}
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
//		//V�lja tr�kkimine.
//		for (Double arv : arvud) {
//			System.out.println(arv + " ");
//		}
	}