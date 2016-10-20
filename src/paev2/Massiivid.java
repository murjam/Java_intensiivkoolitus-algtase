package paev2;

import java.util.Arrays;
import java.util.List;

public class Massiivid {

	public static void main(String[] args) {
		int[] arvud = {1, 2, 3};
		for (int i = 0; i < arvud.length; i++) {
			//ArvuTabel.trykiTabel(arvud[i], 10);
			arvud [i] = i * 3;
			System.out.println(arvud[2 - i]);
		}
		
		
		List<Integer> arvud2 = Arrays.asList(324, 71, 7, 8, 12, 2, 3);
		
		//foreach tsükkel, indeksit ei saa kätte on miinus, tagurpidi välja printida ei saa
		for (Integer arv : arvud2) {
			System.out.println(arv);
		}
		
		for (int i = 0; i < arvud2.size(); i++) {
			System.out.println(arvud2.get(i));
		}
		

	}
	
}
