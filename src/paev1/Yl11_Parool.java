package paev1;

import lib.TextIO;

//Kirjutada programm, mis k�sib kasutajalt parooli ning annab teada, kas kasutaja 
//sisestas �ige v�i vale parooli (�ige parool olgu programmis kirjas).
public class Yl11_Parool {
	public static void main(String[] args) {
		
		System.out.print("Palun sisestage parool: ");
		String parool = TextIO.getlnString();
		
		String oigeParool = "Mati123";
		
		System.out.format("Parool on %s ", oigeParool.equals(parool) ? "�ige!" : "vale!");			
	}
}
