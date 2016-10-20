package paev_1;

public class Diagonaal {
	public static void main(String[] args) {
		
		//Alustada lahendamist väiksemast tabelist NT 3x3.
		int suurus = 7;
		
		for (int y = 0; y < suurus; y++) {
			for (int x = 0; x < suurus; x++) {
//				System.out.format("%2s", y==x || y + x==suurus - 1 ? "X" : ".");     //Format - arvude formattimiseks.
				System.out.print(y == x || y + x == suurus - 1 ? "X " : ". ");
			}
			System.out.println();
		}
	}
}
