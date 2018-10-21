
public class Daty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int r1=2009, m1=12, d1=30;
		int r2=2010, m2=1, d2=1;
		
		int dd1 = r1 * 10000 + m1 * 100 + d1;
		int dd2 = r2 * 10000 + m2 * 100 + d2;
		
		if (dd1 > dd2)
			System.out.print("Pierwsza wieksza: " + dd1);
		else
			System.out.print("Druga wieksza: " + dd2);
	}

}
