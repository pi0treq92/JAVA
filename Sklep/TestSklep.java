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
    
    public static void main(String[] args) {ArrayList<Magazyn> lista = new ArrayList<>();
    ArrayList<Koszyk> lista2 = new ArrayList<>();
    
    String nazwaP;
    String g = "";
    double cena;
    double suma=0;
    int a =0;
    lista.add(new Magazyn("Jablko", 1.5, 10));
    lista.add(new Magazyn("Kiwi", 3.7, 20));
    lista.add(new Magazyn("Cytryna", 0.5, 30));
    Magazyn n = new Magazyn("Gruszka", 2.5,40);
    
    lista.add(n);
    for(int i = 0; i<lista.size();i++)
    {
        System.out.println(lista.get(i).toString());
    }
    int j,t,z;
    int c=0;
    Scanner wartosc = new Scanner(System.in);
        System.out.println("1 - Sklep");
        System.out.println("2 - Magazyn");
    j = wartosc.nextInt();
    switch (j)
    {
        case 1:
           
            System.out.println("Witaj w sklepie, dodaj produkty do listy, wpisując ich nazwę i ilosć");
            
            for(int i = 0; i<lista.size();i++)
            {
                System.out.println(lista.get(i).toString());
            }
            g="y";
            while(g.equals("y"))
            {
                    nazwaP = wartosc.next();
                    System.out.println("Wpisz ilosc");
                    z = wartosc.nextInt();
                    Iterator<Magazyn> iter = lista.iterator();
                    c=0;
                    while (iter.hasNext()) 
                    {
                        System.out.println(c);
                          if(iter.next().toString().contains(nazwaP))
                                break;
                                               
                          else
                            {
                                c++;
                            }
                    }
                    
                    cena = lista.get(c).getcenaDet();
                    System.out.println(cena);
                    lista2.add(new Koszyk(nazwaP, cena, z, cena*z));
                    lista.get(c).zdejmijZmagazynu(z);    
                   
                    System.out.println("Dodac nastepny y/n?");
                    g = wartosc.next();
            }
                System.out.println("Twoje produkty: ");
                for(int i = 0; i<lista2.size();i++)
            {
                System.out.println(lista2.get(i).toString());
            }
                for(int i = 0; i<lista2.size();i++)
                {
                    suma+=lista2.get(i).sumaZakupow();
                }
                System.out.println("Do zapłaty: "+suma+" zł");
                break;
                

        case 2:    
        {
            System.out.println("Magazyn, co wykonać?");
            System.out.println("1 - dodawanie produktow");
            System.out.println("2 - usuwanie produktow");
            
            t = wartosc.nextInt();
            Iterator<Magazyn> iter = lista.iterator();
            switch(t)
            {
                case 1:
                        System.out.println("Wpisz nazwe");
                        nazwaP = wartosc.next();
                        
                        while (iter.hasNext()) 
                        {    
                             if (iter.next().getNazwa().contains(nazwaP))
                             {
                                               
		                               System.out.println("W magazynie jest ten produkt, czy zmienic ilosc? y or n");
                                               g = wartosc.next();
                                               if(g.equals("n"))
                                                    break;
                                               
                                               else
                                               {
                                                    System.out.println("Wpisz ilosc");
                                                    z = wartosc.nextInt();
                                                    lista.get(c).zmienIlosc(z);
                                                    break;
                                               }      
                            }
                             else
                             {
                                 c++;
                             }
                             
                        }
                        
                        if(g.equals("y"))
                            break;
                        else if(g.equals("n"))
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
                            while (iter.hasNext()) 
                            {
                                if (iter.next().getNazwa().contains(nazwaP)) 
                                {
                                    iter.remove();
                                    break;
                                }               
                            }
            }
        }
    }
    for(int i = 0; i<lista.size();i++)
    {
        System.out.println(lista.get(i).toString());
    }
    }

}