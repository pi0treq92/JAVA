/*
Zadanie 21

Napisz program, który obliczy silnię dowolnej liczby naturalnej.
 */
package zad21;

import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class Zad21 {
    
    
public int silnia(int n){
        if(n>1)
            return n*silnia(n-1);
        else
            return 1;
}
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        Zad21 a = new Zad21();
        System.out.println(a.silnia(n));
        
            
    }
    }
    

