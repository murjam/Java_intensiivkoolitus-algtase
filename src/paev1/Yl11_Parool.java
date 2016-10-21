package paev1;

import lib.TextIO;

//Kirjutada programm, mis küsib kasutajalt parooli ning annab teada, kas kasutaja 
//sisestas õige või vale parooli (õige parool olgu programmis kirjas).
public class Yl11_Parool {
	public static void main(String[] args) {
		
		System.out.print("Palun sisestage parool: ");
		String parool = TextIO.getlnString();
		
		String oigeParool = "Mati123";
		
		System.out.format("Parool on %s ", oigeParool.equals(parool) ? "õige!" : "vale!");			
	}
}
