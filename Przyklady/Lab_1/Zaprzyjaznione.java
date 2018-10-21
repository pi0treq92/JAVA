import java.util.Scanner;

public class Zaprzyjaznione {
	public static void main(String[] args) {
		int n;
		int suma1 = 0, suma2 = 0;
		int i = 0;
        Scanner keyboard = new Scanner(System.in);
    	System.out.println("N:");
        n = keyboard.nextInt();
        
        for (i = (n - 1); i > 1; i--) {
        	suma1 = 0; 
        	suma2 = 0;
        	for (int j = 1; j < i; j++) {
        		if (i % j == 0) {
            		suma1 += j;
            	}
        	}
        	for (int j = 1; j < suma1; j++) {
        		if (suma1 % j == 0) {
            		suma2 += j;
            	}
        	}
        	if ( (suma2 == i) && (i != suma1) ) {
        		System.out.println(i + " | " + suma1);
        	}
        }
	}
}