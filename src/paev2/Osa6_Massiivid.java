package paev2;

import java.util.Arrays;
import java.util.List;

public class Osa6_Massiivid {
	public static void main(String[] args) {
		int[] arvud = {1, 2, 3};
		for (int i = 0; i < arvud.length; i++) {
			//ArvuTabel.trykiTabel(arvud[i], 10);
			arvud [i] = i * 3;
			System.out.print(arvud[2 - i] + " ");
		}
		
		//Listiga n�ide.
		List<Integer> arvud2 = Arrays.asList(324, 71, 7, 8, 12, 2, 3);
		
		//foreach ts�kkel - indeksit ei saa k�tte on miinus, tagurpidi v�lja printida ei saa.
		for (Integer arv : arvud2) {
			System.out.print(arv + " ");
		}
		
		System.out.println();
		
		//Tavaline for ts�kkel.
		for (int i = 0; i < arvud2.size(); i++) {
			System.out.print(arvud2.get(i) + " ");
		}
	}
}
