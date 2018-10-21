/*
Zadanie 22

W trakcie podawaniu ciągu liczb (max 100), których znacznikiem 
końca jest liczba 100, zapisz w tablicy tylko te liczby, 
których wartości są większe od 25.Wyświetl ilość liczb większych od 25.
Po wyświetleniu wyniku, program musi zapytać użytkownika, czy  
chce powtórzyć wykonanie programu.
 */
package zad22;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Piotr
 */
public class Zad22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char odp;
        int n;
        int [] tab = new int[0];
        Scanner a = new Scanner(System.in);
        do{
        do{
        n = a.nextInt();
        if(n>25){
            tab = Arrays.copyOf(tab, tab.length+1);
            tab[tab.length-1] = n;
        }
        else 
            continue;}
        while(n!=100);    
        
        for(int i=0; i<tab.length; i++)
            System.out.println(tab[i]+" ");
        System.out.print("Powtórzyć (t/n) ?");
        odp = a.next().charAt(0);
        }
        while(odp!='n');
        
    }
    
}
