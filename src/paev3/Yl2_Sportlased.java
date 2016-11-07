package paev3;

//Täiendada eelmist programmi sedasi, et enne iga arvu küsimist küsitaks kõigepealt nimi.
//Küsitav arv on tinglikult eelnevalt sisestatud nime kettaheite tulemus.
//Trükkida ekraanile sportlaste nimed ja tulemused tulemuste järgi kahanevalt järjestatult.
//Sportlase andmbeobjekti jaoks tasub teha uus klass, mis esialgu võiks välja näha midagi sellist.
//(i)Suvalise andmetüübi (antud juhul sportlane) sorteerimiseks saab kasutada üht kahest liidesest: 
//java.lang.Comparable, java.util.Comparator.

//Et just Sportlane klass oleks Comparable.
public class Yl2_Sportlased implements Comparable<Yl2_Sportlased> {   //extends Object <- alati on vaikimisi.

    String nimi;
    Double tulemus;
    
    //privat - ainult klassi sees kasutamiseks.
    //static Double maailmaRekord;
    //static - on kõikidele sportlastele.
    
    //Konstruktor, saab ka automaatselt genereerida.
    public Yl2_Sportlased(String nimi, double tulemus) {
		this.nimi = nimi;   //viitan just sellele nimele ehk sellele muutujale seal, kuna tekib nime konflikt.
		this.tulemus = tulemus;
	}
    
    @Override
	public String toString() {
		return nimi + " " + tulemus;
		// return super.toString();   //kutsub välja ülemklassi ehk Object klassi toString() meetodi.
	}

	@Override
	public int compareTo(Yl2_Sportlased teine) {
		return tulemus.compareTo(teine.tulemus);
	}
}
