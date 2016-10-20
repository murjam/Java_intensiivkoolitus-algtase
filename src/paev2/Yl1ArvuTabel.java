package paev2;

public class Yl1ArvuTabel {
	//Poilerplate kood, mille peame kirjutama.
	//Programmeerimisel tuleb suur �lesanne algul lihtsamalt kirja panna.
	//Staatiline - kuulub klassile, kui pole kuulub objektile
	
	public static void main(String[] args) {    //String[] args - k�surealt k�ivitamiseks
		trykiTabel(10,10);
		System.out.println("Vahe");
		trykiTabel(5,3);
		System.out.println("Vahe2");
		trykiTabel(100,2);  //Kasutan �ra universaalsust,
		System.out.println(mituAad("Tere, Mart ja Toomas."));
	}
	
	public static int mituAad(String tekst) {
	    int mitu = 0;
	    for (int i = 0; i < tekst.length(); i++) {
	        // charAt annab �he t�he indeksi p�hjal
	        if ('a' == tekst.charAt(i)) {
	            mitu++;
	        }
	    }
	    return mitu;

	    // regex - regular expression, regulaaravaldised on v�ga t�htsad java-s
	    // teine v�imalik implementatsioon vaid �hel real,
	    // mis kasutab regulaaravalidst:
	    // return tekst.replaceAll("[^aA]", "").length();
	}
	
	public static void trykiTabel(int suurus, int alus) {
		
		// for (X; Y; Z) 
		
		// X - t�idetakse 1x enne ts�klit
		// Y - j�tkamistingimus
		// Z - t�idetakse peale igat ts�kli iteratsiooni
		for (int rida = 0; rida < suurus; rida++) 
		{
//			System.out.print(veerg + " ");
			for (int veerg = 0; veerg < suurus; veerg++) 
			{
				int arv = (rida + veerg) % alus;
				
//				if (arv > 9) {
//					arv = arv - 10;
//				}
				System.out.format("%2d",arv);   //%2d - arv v�tab 2 kohta
			}
			System.out.println();
		}
		//Muutuja on selles kontekstis kus ta on deklareeritud.
//		System.out.println(i);
	}
	

}
