package paev1;

//Trükkida ekraanile paaritud arvud 0 kuni 30 (1, 3, 5..)
public class Yl14_Paaritu0kuni30 {
	public static void main(String[] args) {
		
		for (int alates = 0; alates <= 30; alates++) {
			if (0 != alates % 2) {
				//Koma lisamine lahendatakse siin eraldi.
				System.out.print(alates != 0 && alates != 1 ? ", " : "");
				System.out.print(alates);
			}
		}
		
	}
}