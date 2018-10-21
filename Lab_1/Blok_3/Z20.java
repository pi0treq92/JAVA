/*
Zadanie 20

Napisz program, który pozwoli wprowadzić 10 liczb
,przy czym zostaną zapisane tylko te liczby, których wartości są większe od 25. 
Wyświetl ilość liczb większych od 25. Po wyświetleniu wyniku, 
program musi zapytać użytkownika, czy  chce powtórzyć wykonanie programu.
 */
package z20;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Piotr
 */
public class Z20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char odp;
        int [] tab = new int[0];
        Scanner liczba = new Scanner(System.in);
        do{
        for(int i=0; i<5; i++){
             int a = liczba.nextInt();
             if (a>25){
                 tab = Arrays.copyOf(tab, tab.length+1);
                 tab[tab.length-1]=a;
             
             }
             else
                 continue;
        }
        for(int j=0;j<tab.length; j++){
            System.out.print(tab[j]+" ");}
    
        
        System.out.print("Powtórzyć (t/n) ?");
        odp = liczba.next().charAt(0);
        }
        while(odp!='n');
    
}
}