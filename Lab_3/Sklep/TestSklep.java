/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sklep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class TestSklep {
    
    public static void main(String[] args) {
    ArrayList<Magazyn> lista = new ArrayList<>();
    String nazwaP,f;
    String g = "";
    double cena;
    lista.add(new Magazyn("Jabłko", 1.5, 1));
    lista.add(new Magazyn("Kiwi", 3.7, 2));
    lista.add(new Magazyn("Cytryna", 0.5, 3));
    Magazyn n = new Magazyn("Gruszka", 2.5,4);
    lista.add(n);
    for(int i = 0; i<lista.size();i++)
    {
        System.out.println(lista.get(i).getNazwa());
        System.out.println(lista.get(i).getIlosc());
        System.out.println(lista.get(i).getcenaHurt());
    }
    int j,t,z;
    int c=0;
    Scanner wartosc = new Scanner(System.in);
    
    j = wartosc.nextInt();
    switch (j){
        case 1:
           {
            System.out.println("Sklep: ");
            break;
            }
           
        case 2:    
        {
            System.out.println("Magazyn, co wykonać?");
            System.out.println("1 - dodawanie produktow");
            System.out.println("2 - usuwanie produktow");
            
            t = wartosc.nextInt();
            Iterator<Magazyn> iter = lista.iterator();
            switch(t){
                    
                case 1:
                        System.out.println("Wpisz nazwe");
                        nazwaP = wartosc.next();
                        
                        while (iter.hasNext()) {
                            
                             if (iter.next().getNazwa().contains(nazwaP)){
                                               
		                               System.out.println("W magazynie jest ten produkt, czy zmienic ilosc? y or n");
                                               g = wartosc.next();
                                               if(g == "y")
                                                    break;
                                               
                                               else
                                               {
                                                System.out.println("Wpisz ilosc");
                                                z = wartosc.nextInt();
                                                lista.get(c).zmienIlosc(z);
                                                break;
                                               }
                                               
                            }
                             else{
                                 c++;
                                 
                                 System.out.println(c);
                             }
                             
                            }
                        
                        
                        f=g;
                        
                        if(f.equals("y"))
                            break;
                        else if(f.equals("n"))
                            break;
                        else
                        {
                       
                        System.out.println("Wpisz cena");                     
                        cena = wartosc.nextDouble();
                        System.out.println("Wpisz ilosc");
                        z = wartosc.nextInt();
                        lista.add(new Magazyn(nazwaP, cena, z));
                        break;
                        }
                        
        
                        
                        
                    case 2:
                        System.out.println("Wpisz nazwe produktu do usuniecia");
                        nazwaP = wartosc.next();
                        while (iter.hasNext()) {
                            if (iter.next().getNazwa().contains(nazwaP)) {
                                iter.remove();
                        break;
    }
        }
            }
        }
    }
    
      for(int i = 0; i<lista.size();i++)
    {
        System.out.println(lista.get(i).getNazwa());
        System.out.println(lista.get(i).getIlosc());
        System.out.println(lista.get(i).getcenaHurt());
    }
    }

}
