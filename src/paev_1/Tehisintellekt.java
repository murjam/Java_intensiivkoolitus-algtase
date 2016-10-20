package paev_1;

import lib.TextIO;

public class Tehisintellekt {
	
	public static void main(String[] args) {
		
		System.out.println("Sisesta kaks vanust");
		int vanus1 = TextIO.getlnInt();
		int vanus2 = TextIO.getlnInt();
		
		int vahe = Math.abs(vanus1 - vanus2);
		Math.max(vanus1, vanus2);
		
		if (vahe < 5) {
			System.out.println("Sobib!");
		} 
		
		else if (vahe <= 10) {   //[5..10)
			System.out.println("Ei sobi!");
		}
		
		else {
			System.out.println("Tõsiselt ei sobi!");
		}
	}

}
