package paev2;

public class Yl5IksPluss {
	
	public static void main(String[] args) {
		
		int suurus = 11;
		
		String jada = Yl2Jada.symboliJada('-', suurus*2+3);
		jada = jada + " " + jada;
		System.out.println(jada);
		
		for (int rida = 0; rida < suurus; rida++) {
			System.out.print("| ");
			for (int veerg = 0; veerg < suurus; veerg++) {
		    	if (rida == veerg || rida + veerg == suurus - 1 ) {
		    		System.out.print("X ");
		    	}
		    	else {
		    		System.out.print("  ");
		    	}
//				System.out.print(rida == veerg || rida + veerg == suurus - 1 ? "X " : "  ");
			}
//			System.out.println();
//		}
//		
//		for (int rida = 0; rida < suurus; rida++) {
			System.out.print("| ");
			System.out.print("| ");
			for (int veerg = 0; veerg < suurus; veerg++) {
		    	if (suurus / 2 == veerg || suurus / 2 == rida) {
		    		System.out.print("X ");
		    	}
		    	else {
		    		System.out.print("  ");
		    	}
//				System.out.print(suurus / 2 == veerg ? "X " : "  ");  //avaldis ()-s tingimus ? siis see : muul juhul see 
			}
			System.out.println("|");
			
		}
		System.out.println(jada);
	}
	
}


