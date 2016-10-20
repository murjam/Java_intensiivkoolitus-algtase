package paev1;

public class Muutujad {
	public static void main(String[] args) {
		
		int arv = -2;  //Muutuja, ta väärtust saab muuta.
		System.out.println(arv);   // int - täisarv 32bit
		
		arv = -3;
		System.out.println(arv);
		
		arv = arv + 1;    //Omistamine.
		System.out.println("Siin" + arv + "seal");   //Teksti kokku liitmine. Konkateerimine ingl keeles.
		
		System.out.println(10/5);    //Vaikimisi int.
		System.out.println((double)10/6.);  //Type castimine.
		
		System.out.println("1+2");    //See on avaldis.
		System.out.println(-2);       //int - täisarv 32bit 231 ~= 2G
		System.out.println(.2);	      //double - komaga arv .2-0.2  64bit
		System.out.println(true);     //boolean - tõeväärtus
		System.out.println('a');      //char - üks märk 16bit
		System.out.println("Tere".length());   //String - tekst
	}

}
