package paev3;

//Et just Sportlane klass oleks Comparable.
public class Sportlane implements Comparable<Sportlane> {   //extends Object <- alati on vaikimisi.

    String nimi;
    Double tulemus;
    
    //privat - ainult klassi sees kasutamiseks.
    //static Double maailmaRekord;
    //static - on kõikidele sportlastele.
    
  //Konstruktor, saab ka automaatselt genereerida.
    public Sportlane(String nimi, double tulemus) {
		this.nimi = nimi;   //viitan just sellele nimele ehk sellele muutujale seal, kuna tekib nime konflikt.
		this.tulemus = tulemus;
	}
    
    @Override
	public String toString() {
		return nimi + " " + tulemus;
		// return super.toString();   //kutsub välja ülemklassi ehk Object klassi toString() meetodi.
	}

	@Override
	public int compareTo(Sportlane teine) {
		return tulemus.compareTo(teine.tulemus);
	}
}
