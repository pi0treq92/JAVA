
public class Min2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;

		int w = ((a>b)?b:a)>c?c:((a>b)?b:a);
		System.out.println("w = " + w);
	}

}
