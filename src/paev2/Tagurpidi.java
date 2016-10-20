package paev2;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class Tagurpidi {

	public static void main(String[] args) {
		
		if (-1 != "mingi tekst".indexOf("s")) {
			
		}
		if ("mingi tekst".contains("s")) {
			
		}
		
		
		int count = 5;
		System.out.format("Sisesta %d arvu:\n", count);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < count; i++) {
			int number = TextIO.getlnInt();
			numbers.add(number);
		}
		
		System.out.println("Sisestatud arvud tagurpidi:");
		
		Collections.reverse(numbers);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		
//		for (int i = numbers.size() - 1; i >= 0; i--) {
//			System.out.println(numbers.get(i));
//		}
		
	}
	
}
