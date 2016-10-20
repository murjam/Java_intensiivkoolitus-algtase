package paev2;

public class Podramaja {
	
	public static boolean onTaishaalik(char taht) {
		return "aeiouõäöü".contains(String.valueOf(taht));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(onTaishaalik('a'));
		System.out.println(onTaishaalik('b'));
	}

}
