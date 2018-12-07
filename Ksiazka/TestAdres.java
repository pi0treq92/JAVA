/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ksiazka;

import java.util.*;

/**
 *
 * @author Piotr
 */
public class TestAdres {
    public static void main(String[] args) {
        String s, imie, nazwisko, ulica, miasto;
        int kod;
        List<Ksiazka> lista = new ArrayList<>();
           lista.add(new Adres("Pawel", "Lewandowski", 87800, "Konwaliowa", "Gdansk"));
           lista.add(new Adres("Adam", "Pierwszy", 50800, "Azaliowa", "Gdynia"));
           lista.add(new Adres("Jan", "Kowalski", 14100, "Tulipanowa", "Sopot"));
           lista.add(new Adres("Ala", "Bąk", 23600, "Rozana", "Słupsk"));
           lista.add(new Adres("Ola", "Osa", 92170, "Akacjowa", "Radom"));
           
           for(int j =0; j<lista.size();j++)
                System.out.println(lista.get(j).toString());
        Scanner a = new Scanner(System.in);
        System.out.println("Wpisz nazwisko do usunięcia.\n");
        s = a.next();
           Iterator<Ksiazka> iter = lista.iterator();
		while (iter.hasNext()) {
		    if (iter.next().getNazwisko().contains(s)) {
		        iter.remove();
}}
        for(int j =0; j<lista.size();j++)
                System.out.println(lista.get(j).toString());
        System.out.println("Wprowadz adres do ksiażki.\n");
        System.out.println("Wpisz imie.\n");
        imie = a.next();
        System.out.println("Wpisz nazwisko.\n");
        nazwisko = a.next();
        System.out.println("Wpisz kod.\n");
        kod = a.nextInt();
        System.out.println("nWpisz ulice.\n");
        ulica = a.next();
        System.out.println("Wpisz miasto.\n");
        miasto = a.next();
        lista.add(new Adres(imie, nazwisko, kod, ulica, miasto));
        for(int j =0; j<lista.size();j++)
                System.out.println(lista.get(j).toString());
        
    }
    
}
