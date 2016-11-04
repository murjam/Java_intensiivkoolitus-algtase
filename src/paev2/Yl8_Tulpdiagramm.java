package paev2;

import lib.TextIO;

//Kirjutada tekstire�iimis tulpdiagrammi joonistav programm.
//K�sida kasutajalt j�rjest arve seni, kuni kasutaja sisestab nulli. Negatiivseid arve mitte lubada.
//Tr�kkida ekraanile x t�htedest koosnev tulpdiagramm, kus x-e vastavalt sisestatud arvudele.
//(i)Joondamise jaoks saad j�llegi kasutada funktsiooni System.out.format().
public class Yl8_Tulpdiagramm {
	//N�iteks, kui kasutaja sisestas arvud 5 3 8 ja 11, on v�ljund:
    //5 xxxxx
    //3 xxx
	//8 xxxxxxxx
	//11 xxxxxxxxxxx
	public static void main(String[] args) 
	{
		String tulemus = "";
		char taht = 'X';
		
		System.out.println("Sisesta arv: ");
		int sisestatudArv = TextIO.getlnInt();
		
		//Veat��tlus ja veateade, meil vaja while, kuna asi peab ts�klisse j��ma.
		while (true) {  //sisestatudArv < 0 || sisestatudArv != 0
			if (sisestatudArv < 0) {
				System.out.print("Negatiivsed arvud pole lubatud.\n");
				sisestatudArv = TextIO.getlnInt();
				
			} else {
				for (int i = 0; i < sisestatudArv; i++) {
					tulemus = tulemus + taht;
				}
//				System.out.format("%5d", tulemus);
				System.out.print(" " + tulemus + "\n");
				tulemus = "";
				
//				System.out.print(" \nArv pole 0, sisesta uuesti: ");
				sisestatudArv = TextIO.getlnInt();
			}
		}
		System.out.println("\nMe j�udsime l�puks nulli!");
	}
}
