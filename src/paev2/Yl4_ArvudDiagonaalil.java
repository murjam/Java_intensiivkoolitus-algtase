package paev2;

//Tr�kkida ekraani k�rvaldiagonaalile �levalt alla kasvavad arvud.
public class Yl4_ArvudDiagonaalil {
	public static void main(String[] args) 
	{
		int suurus = 6;
		int alates = -1;
		
		for (int i = 0; i < suurus; i++) {
			for (int j = 0; j < suurus; j++) {
				System.out.print(i + j == suurus - 1 ? alates = alates + 1 : "  ");
			}
			System.out.println();
		}
	}
}
