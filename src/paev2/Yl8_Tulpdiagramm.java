package paev2;

import lib.TextIO;

//Kirjutada tekstireþiimis tulpdiagrammi joonistav programm.
//Küsida kasutajalt järjest arve seni, kuni kasutaja sisestab nulli. Negatiivseid arve mitte lubada.
//Trükkida ekraanile x tähtedest koosnev tulpdiagramm, kus x-e vastavalt sisestatud arvudele.
//(i)Joondamise jaoks saad jällegi kasutada funktsiooni System.out.format().
public class Yl8_Tulpdiagramm {
	//Näiteks, kui kasutaja sisestas arvud 5 3 8 ja 11, on väljund:
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
		
		//Veatöötlus ja veateade, meil vaja while, kuna asi peab tsüklisse jääma.
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
		System.out.println("\nMe jõudsime lõpuks nulli!");
	}
}
