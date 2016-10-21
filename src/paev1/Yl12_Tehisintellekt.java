package paev1;

import lib.TextIO;

public class Yl12_Tehisintellekt {
	public static void main(String[] args) {
		
		System.out.println("Sisesta kaks vanust: ");
		int vanus1 = TextIO.getlnInt();
		int vanus2 = TextIO.getlnInt();
		
		int vahe = Math.abs(vanus1 - vanus2);
//		Math.max(vanus1, vanus2);  Siin lihtsalt veel üks meetod Math-lt.
		
		if (vahe < 5) {
			System.out.println("Sobib!");
		}
		
		else if (vahe >= 5 && vahe <= 10) {   //[5..10)
			System.out.println("Ei sobi!");
		}
		
		else {
			System.out.println("Kindlasti ei sobi!");
		}
	}
}
