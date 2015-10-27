package uebung_3_1;

public class uebung_3_1 {

	public static void main(String[] args) {
		double p = 8;
		double q = 16;

		double vWurzel = -1 * (p / 2);
		double uWurzel = ((p / 2) * (p / 2)) - q;

		if (uWurzel < 0) {
			System.out.println("Es gibt nur eine komplexe Lösung.");
		}

		else {
			if (uWurzel == 0) {
				System.out.println("x0 = " + vWurzel);
			} else {
				double loesung1 = vWurzel + Math.sqrt(uWurzel);
				double loesung2 = vWurzel - Math.sqrt(uWurzel);

				System.out.println("x1 = " + loesung1);
				System.out.println("x2 = " + loesung2);
			}
		}
	}

}
