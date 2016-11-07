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
	public static int sisestatudArv(String tulemus, char taht) {
		
		System.out.println("Sisesta arv: ");
		
		while (true) {
			int sisestatudArv = TextIO.getlnInt();
			
			if (sisestatudArv < 0) {
				System.out.print("Negatiivsed arvud pole lubatud. \nSisesta uus arv: \n");
			}
			
			else if (sisestatudArv >= 0) {
				if (sisestatudArv != 0) {
					for (int i = 0; i < sisestatudArv; i++) {
						tulemus = tulemus + taht;
					}
					System.out.format("%s", sisestatudArv + " " + tulemus + " \n");
					tulemus = "";

				} else {
					return sisestatudArv;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		sisestatudArv("", 'X');
		System.out.println(" - Kasutaja jõudis nulli!");  //sisestatudArv("", 'X')
	}
}
