/*
Napisz program
, 
który utworzy i wyświetli zbiór dziesięciu liczb, 
przy czym każda kolejna liczba zbioru musi być wielokrotnością 
wprowadzanej przez użytkownika liczby zgodnie z poniższym 
przykładem
:
        5   0   5*0
        8   1   8*1
        0   2   0*2
Po wyświetleniu wyniku, program musi zapytać użytkownika, czy  
chce powtórzyć wykonanie programu.
 */
package z182;

import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class Z182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner liczba = new Scanner(System.in);
    char odp;
    do{ 
        int [] tab= new int [10];
        for(int i=0; i<5; i++){
            int a = liczba.nextInt();
            tab[i]=a*i;
        }
        for(int i=0; i<10; i++){
            System.out.print(tab[i]+" ");
        }
        
       
        Scanner scanner= new Scanner(System.in);
        System.out.print("Powtórzyć (t/n) ?");
        odp = scanner.next().charAt(0);
       }
while(odp!='n');
    }
    
}