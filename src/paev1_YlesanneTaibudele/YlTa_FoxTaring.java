package paev1_YlesanneTaibudele;

public class YlTa_FoxTaring {
	
	public static void main(String[] args) {
		String taring[][] = {
				{
					"+-------+",
					"|       |",
					"|   *   |",
					"|       |",
					"+-------+"
				},
				{
					"+-------+",
					"|       |",
					"| *   * |",
					"|       |",
					"+-------+"
				},
				{
					"+-------+",
					"| *     |",
					"|   *   |",
					"|     * |",
					"+-------+"
				},
				{
					"+-------+",
					"| *   * |",
					"|       |",
					"| *   * |",
					"+-------+"
				},
				{
					"+-------+",
					"| *   * |",
					"|   *   |",
					"| *   * |",
					"+-------+"
				},
				{
					"+-------+",
					"| *   * |",
					"| *   * |",
					"| *   * |",
					"+-------+"
				}
			};
			int i;
			int t1 = (int)(Math.random() * taring.length);
			
			for (i = 0; i < taring[t1].length; i++) {
				System.out.println(taring[t1][i]);
			}
			
			int i2;
			int t11 = (int)(Math.random() * taring.length);
			
			for (i2 = 0; i2 < taring[t11].length; i2++) {
				System.out.println(taring[t11][i2]);
			}
	}

}
