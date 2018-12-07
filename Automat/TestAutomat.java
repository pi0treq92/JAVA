/*

 */
package Automat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class TestAutomat  {
    public static void main(String[] args) {
    
    List<Napoj> lista = new ArrayList<>();
    lista.add(new Napoj(1,"Coca-Cola", 2.5));
    lista.add(new Napoj(2,"Sprite", 2.0));
    lista.add(new Napoj(3,"Fanta", 3.0));
    lista.add(new Napoj(4,"Herbata", 4.5));
    lista.add(new Napoj(5,"Kawa", 5.0));
    lista.add(new Napoj(6,"Woda", 1.5));
    lista.add(new Napoj(7,"RedBull", 6.5));
    lista.add(new Napoj(8,"Mleko", 2.0));
    char str;
    double i;
    int j;
    Scanner liczba = new Scanner(System.in);
    
    do{
    System.out.println("Wrzuc pieniadze");
    i = liczba.nextDouble();
       for(int d = 0; d<lista.size(); d++)
            System.out.println(lista.get(d).toString());
    System.out.println("Wybierz napoj");
    j = liczba.nextInt();
 
    switch (j){
        case 1:
            if(i>=lista.get(0).getCena()){
                System.out.println("Wybrano: "+lista.get(0).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(0).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
        case 2:
            if(i>=lista.get(1).getCena()){
                System.out.println("Wybrano: "+lista.get(1).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(1).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
            case 3:
            if(i>=lista.get(2).getCena()){
                System.out.println("Wybrano: "+lista.get(2).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(2).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
            case 4:
            if(i>=lista.get(3).getCena()){
                System.out.println("Wybrano: "+lista.get(3).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(3).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
            case 5:
            if(i>=lista.get(4).getCena()){
                System.out.println("Wybrano: "+lista.get(4).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(4).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
            
            case 6:
            if(i>=lista.get(5).getCena()){
                System.out.println("Wybrano: "+lista.get(5).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(5).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
            case 7:
            if(i>=lista.get(6).getCena()){
                System.out.println("Wybrano: "+lista.get(6).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(6).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
            case 8:
            if(i>=lista.get(7).getCena()){
                System.out.println("Wybrano: "+lista.get(7).toString());
                System.out.println("Zwrot reszty: "+(i-lista.get(7).getCena())+" zł");
                break;
            }
            else{
            System.out.println("Za mało pieniedzy");
            break;}
    };
        System.out.println("Czy kontynuować y/n? ");
        str = liczba.next().charAt(0);
    }
    while(str!='n');
    
    
    
    }
}
