package paev3;

//T�iendada eelmist programmi sedasi, et enne iga arvu k�simist k�sitaks k�igepealt nimi.
//K�sitav arv on tinglikult eelnevalt sisestatud nime kettaheite tulemus.
//Tr�kkida ekraanile sportlaste nimed ja tulemused tulemuste j�rgi kahanevalt j�rjestatult.
//Sportlase andmbeobjekti jaoks tasub teha uus klass, mis esialgu v�iks v�lja n�ha midagi sellist.
//(i)Suvalise andmet��bi (antud juhul sportlane) sorteerimiseks saab kasutada �ht kahest liidesest: 
//java.lang.Comparable, java.util.Comparator.

//Et just Sportlane klass oleks Comparable.
public class Yl2_Sportlased implements Comparable<Yl2_Sportlased> {   //extends Object <- alati on vaikimisi.

    String nimi;
    Double tulemus;
    
    //privat - ainult klassi sees kasutamiseks.
    //static Double maailmaRekord;
    //static - on k�ikidele sportlastele.
    
    //Konstruktor, saab ka automaatselt genereerida.
    public Yl2_Sportlased(String nimi, double tulemus) {
		this.nimi = nimi;   //viitan just sellele nimele ehk sellele muutujale seal, kuna tekib nime konflikt.
		this.tulemus = tulemus;
	}
    
    @Override
	public String toString() {
		return nimi + " " + tulemus;
		// return super.toString();   //kutsub v�lja �lemklassi ehk Object klassi toString() meetodi.
	}

	@Override
	public int compareTo(Yl2_Sportlased teine) {
		return tulemus.compareTo(teine.tulemus);
	}
}
