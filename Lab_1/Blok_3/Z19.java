/*
Zadanie 19

Napisz program, który pozwoli wprowadzić 10 liczb, przy czym 
zostaną zapisane tylko te liczby, w przypadku których będzie 
spełniony warunek: kolejna liczba musi być większa od 
poprzedniej. Po wyświetleniu wyniku, program musi zapytać użytkownika, czy  
chce powtórzyć wykonanie programu.
 */
package z19;

import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class Z19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner liczba = new Scanner(System.in);
        char odp;
        int b=0;
        int [] tab = new int[10];
        int [] tab1 = new int[10];
        do{
            for(int i=0; i<10;i++){
                int a = liczba.nextInt();
                if(i>=1){
                    if (a>b){
                        tab1[i]=a;
                        b=a;
                        }
                    else{
                        tab1[i]=0;
                        }
                    }
                else{
                    tab1[0]=a;
                    b=a;
                }
            }
            for(int i=0; i<tab.length; i++){
            System.out.print(tab1[i]+" ");
            }
            
            Scanner scanner= new Scanner(System.in);
            System.out.print("Powtórzyć (t/n) ?");
            odp = scanner.next().charAt(0);
        }
        while(odp!='n');
    }
    
}
