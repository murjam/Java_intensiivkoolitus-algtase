package paev1;

public class Osa12_Tsyklid {
	public static void main(String[] args) {
		
		//a < 3 käib tsüklit 3 korda läbi, a <= 3 ehk pluss x korda.
		for (int a = 10; a > 3; a--) {
			System.out.println("a " + a);
		}
		
		int a = 4;
		
		//Ei tea mitu korda tsüklit käivitame ehk kasutame while tsüklit.
		while (a < 10) {
			System.out.println("Õige " + a);
			a += 1;     //Võib ka a = a + 1;
		}
	}
}
