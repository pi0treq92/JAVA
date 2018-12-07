/*
Zad 29.
Napisz (obiektowo) program wykorzystując tablicę polimorficzną, który będzie książką adresową. Program musi umożliwiać 
wprowadzanie i usuwanie pozycji z książki adresowej oraz wyświetlanie danych z danej pozycji.
 */
package Ksiazka;

/**
 *
 * @author Piotr
 */
public class Ksiazka {
    
    String imie;
    String nazwisko;
    int id;
    Ksiazka(String i, String na)
    {
        
        this.imie = i;
        this.nazwisko = na;
    }
    
    String getName()
    {
        return this.imie;
    }
    String getNazwisko()
    {
        return this.nazwisko;
    }
    
}

