package paev2;

//Trükkida ekraanile kõrvuti kaks kujundit koos ääristega.
//Kujundi kõrgus on sama mis laius - see suurus küsi kasutaja käest.
public class Yl5_IksPluss {
	public static void main(String[] args) {
		
		int suurus = 11;
		
		String jada = Yl2_SymboliteJada.symboliJada('-', suurus*2+3);
		jada = jada + " " + jada;
		System.out.println(jada);
		
		for (int rida = 0; rida < suurus; rida++) {
			System.out.print("| ");
			for (int veerg = 0; veerg < suurus; veerg++) {
				System.out.print(rida == veerg || rida + veerg == suurus - 1 ? "X " : "  ");
			}

			System.out.print("| ");
			System.out.print("| ");
			for (int veerg = 0; veerg < suurus; veerg++) {
				//avaldis(tingimus ? siis see : muul juhul see) 
				System.out.print(suurus / 2 == veerg || suurus / 2 == rida ? "X " : "  ");
			}
			System.out.println("|");
			
		}
		System.out.println(jada);
	}
}
