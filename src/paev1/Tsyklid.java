package paev1;

public class Tsyklid {
	public static void main(String[] args) {
		
		//C, C++ ehk C++ on C keele laiendus.
//		a += 1;   //a = a + 1;
		
		for (int a = 10; a > 3; a--) {     //a < 3 k�ib ts�klit 3 korda l�bi, a <= 3 ehk pluss x korda.
			System.out.println("a " + a);
		}
		
		int a = 4;
		
		//Ei tea mitu korda ts�klit k�ivitame.
		while (a < 10) {
			System.out.println("�ige " + a);
			a = a + 1;
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		System.out.println("Pidu l�bi");
	}

}
