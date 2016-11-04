package paev1;

//Trükkida ekraanile paaritud arvud 0 kuni 30 (1, 3, 5..)
public class Yl14_Paaritu0kuni30 {
	public static void main(String[] args) {
		
		for (int alates = 0; alates <= 30; alates++) {

			System.out.print(0 == alates % 2 ? "" : alates + ", ");
			
			if (alates == 30) {
				//Kuidas saada viimane koma minema? äkki .lastIndexOf(", ") abil?
				
			}
		}
	}
}
