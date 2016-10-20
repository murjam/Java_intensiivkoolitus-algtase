package paev1;

public class Tsyklid {
	public static void main(String[] args) {
		
		//C, C++ ehk C++ on C keele laiendus.
//		a += 1;   //a = a + 1;
		
		for (int a = 10; a > 3; a--) {     //a < 3 käib tsüklit 3 korda läbi, a <= 3 ehk pluss x korda.
			System.out.println("a " + a);
		}
		
		int a = 4;
		
		//Ei tea mitu korda tsüklit käivitame.
		while (a < 10) {
			System.out.println("Õige " + a);
			a = a + 1;
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		System.out.println("Pidu läbi");
	}

}
