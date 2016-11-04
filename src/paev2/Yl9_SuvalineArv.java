package paev2;

//Luua meetod, mis tagastab suvalise täisarvu etteantud vahemikust.
//Math.random() meetod annab double-tüüpi väärtuse vahemikus [0..1).
public class Yl9_SuvalineArv {
	public static int suvaline(int min, int max) {
		
		double suvalineOsa = Math.random(); // [0..1)
		int variatsioone = max - min + 1;
		double suvalineArv = variatsioone * suvalineOsa; // [0..variatsioone)
		suvalineArv = suvalineArv + min; // [min..max+1)

		int suvalineTaisArv = (int) suvalineArv; // [min..max] täisarvuna

		return suvalineTaisArv;

		//Sama asi ühel real:
		//return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		System.out.println(suvaline(1, 5));
		
		//Siin tagastab Suvalise arvu 100-l korral samas vahemikus.
//		for (int i = 1; i < 100; i++) {
//			System.out.println(suvaline(1, 3));
//		}
	}
}
