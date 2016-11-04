package paev2;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

//Kirjutada programm, mis k�sib kasutajalt 10 v�i 5 arvu ning tr�kib nad seej�rel 
//vastupidises j�rjekorras ekraanile.
public class Yl6_Tagurpidi {
	public static void main(String[] args) {
		
		int count = 5;
		System.out.format("Sisesta %d arvu: \n", count);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < count; i++) {
			int number = TextIO.getlnInt();
			numbers.add(number);
		}
		
		System.out.println("\nSisestatud arvud tagurpidi:");
		Collections.reverse(numbers);
		
		//Foreach ts�kliga tr�kime numbrid tagurpidi v�lja.
		for (Integer number : numbers) {
			System.out.print(number + " ");
		}
	}
}
