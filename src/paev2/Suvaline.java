package paev2;

public class Suvaline
{

	public static int suvaline(int min, int max) {

		double suvalineOsa = Math.random(); // [0..1)
		int variatsioone = max - min + 1;
		double suvalineArv = variatsioone * suvalineOsa; // [0..variatsioone)
		suvalineArv = suvalineArv + min; // [min..max+1)

		int suvalineTaisArv = (int) suvalineArv; // [min..max] täisarvuna

		return suvalineTaisArv;

		// sama asi ühel real:
		// return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(suvaline(1, 3));

		}

	}
}
