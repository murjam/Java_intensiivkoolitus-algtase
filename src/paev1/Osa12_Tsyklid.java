package paev1;

public class Osa12_Tsyklid {
	public static void main(String[] args) {
		
		//a < 3 k�ib ts�klit 3 korda l�bi, a <= 3 ehk pluss x korda.
		for (int a = 10; a > 3; a--) {
			System.out.println("a " + a);
		}
		
		int a = 4;
		
		//Ei tea mitu korda ts�klit k�ivitame ehk kasutame while ts�klit.
		while (a < 10) {
			System.out.println("�ige " + a);
			a += 1;     //V�ib ka a = a + 1;
		}
	}
}
