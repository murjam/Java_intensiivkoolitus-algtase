package paev2;

//Kirjutada kuulujuttude generaator.
//Olgu kolm massiivi: naisenimed, mehenimed ja tegus�nad.
//Programm v�tab igast massiivist �he suvalise elemendi ja kombineerib nendest lause.
//(i)Massiivist suvalise elemendi valimiseks leia suvaline indeks vahemikus 0 kuni massiivi pikkus-1.
public class Yl12_KuulujutuGeneraator {
	public static void main(String[] args) {
		
		System.out.print("Kuulujutt j�rgmine: \n\n" + suvalineTulemus());
	}
	
	//Suvalise elemendi leidmine massiivist
	public static String suvaline(String[] naised, String[] mehed, String[] tegevus) 
	{
		return null;
	}
	
	//(i)Pane t�hele, et andmeelemendid nimede ja tegevuste jaoks on Stringide massiivid.
	//M�istlik oleks kirjutada �ldine meetod, mis annab Stringi massiivist suvalise elemendi:
	public static String suvalineTulemus() {
		
		String[] naised = {"Tiia", "Anna", "Kerli"};
		String[] mehed = {"Toivot :O", "Kallet :O", "Aivarit :O"};
		String[] tegevus = {"armastab", "hoiab", "j�lgib"};
		
		String jutt = naised[(int) (Math.random() * naised.length)] + " " +
					  tegevus[(int) (Math.random() * tegevus.length)] + " " +
					  mehed[(int) (Math.random() * mehed.length)];
		
		return jutt;
	}
}
