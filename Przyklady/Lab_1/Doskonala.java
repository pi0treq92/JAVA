import java.util.Scanner;

public class Doskonala {
	public static void main(String[] args) {
		long n;
		long suma = 0;
		long i = 0;
        //Scanner keyboard = new Scanner(System.in);
    	//System.out.println("N:");
        n = Integer.MAX_VALUE;//keyboard.nextInt();
        
        for (i = 5; i < n; i++) {
        	suma = 0;
        	for (int j = 1; j < i; j++) {
        		if (i % j == 0) {
            		suma += j;
            	}
        	}
        	if (suma == i) {
        		System.out.println(i);
        	}
        }
	}
}