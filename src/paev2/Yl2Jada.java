package paev2;

public class Yl2Jada {
	
	// symboliJada('a', 5) -> "aaaaa"
	// symboliJada('x', 10) -> "xxxxxxx"
	public static String symboliJada(char taht, int mitu) 
	{
//		String tulemus = "";
//		
//		for (int i = 0; i < mitu; i++) {
//			tulemus = tulemus + taht;;
//		}
//  		System.out.println("symboliJada('x', 10)");
//		
//		return tulemus;
		
		return String.format("%" + mitu + "s", "").replace(' ', taht);    //Progejate stiil.
	}
	
	public static void main(String[] args) {
		System.out.println(symboliJada('a', 5));
		String tahed = symboliJada('x', 10);
	}
}
