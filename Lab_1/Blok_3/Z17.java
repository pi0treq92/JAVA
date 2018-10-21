/*
Zadanie 17

Napisz program, który utworzy zbiór dziesięciu liczb wprowadzanych z klawiatury 
i wyświetli największą z tych liczb, które dzielą się bez reszty przez 5. 
Po wyświetleniu wyniku, program musi zapytać użytkownika, czy  chce powtórzyć wykonanie programu.
 */
package z17;

/**
 *
 * @author Piotr
 */
import java.util.Scanner;
public class Z17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b = 0;
        Scanner liczba = new Scanner(System.in);
        // TODO code application logic here
        char odp;
    do{ 
        int [] tab= new int [10];
        for(int i=0; i<10; i++){
            int a = liczba.nextInt();
            tab[i]=a;
        }
        for(int i=0; i<tab.length; i++){
        if(i>=1){
        if (tab[i]>tab[i-1] && tab[i]%5==0){
            b=tab[i];}
        
        else{
                 continue;
                    }
        }
        else{
        b=tab[0];
        }
        }
        System.out.println("Najwieksz podzielna przez 5 to: " +b);
    

       
        Scanner scanner= new Scanner(System.in);
        System.out.print("Powtórzyć (t/n) ?");
        odp = scanner.next().charAt(0);
       }
while(odp!='n');
    }
    
}
