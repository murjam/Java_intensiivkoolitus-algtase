package paev2;

//Luua meetod, mis tagastab s�ne (String), mis koosneb etteantud arv korda etteantud s�mbolist.
//(i)V�id alustada sellega, et meetod tr�kiks soovitud tulemuse lihtsalt v�ljundisse, 
//kuid l�pptulemusena peaks meetodit kindlasti tagastama teksti (String), 
//mitte tr�kkima seda v�ljundisse, sest tr�kkimata on ta paremini korduvkasutatav.
public class Yl2_SymboliteJada {
	public static String symboliJada(char taht, int mitu) 
	{
		String tulemus = "";
		
		for (int i = 0; i < mitu; i++) {
			tulemus = tulemus + taht;;
		}
		
		return tulemus;
		
//		return String.format("%" + mitu + "s", "").replace(' ', taht);    //Progejate stiilis kirjutatud.
	}
	
	public static void main(String[] args) {
		System.out.println(symboliJada('a', 5));
//		String tahed = symboliJada('x', 10);   //Tagastab String-i.
	}
}
