/*
Zad 30
Napisz (obiektowo) program „Automat z napojami”. Program ma symulować działanie automatu z napojami, który po „wrzuceniu” 
odpowiedniej monety oraz wybraniu dowolnej pozycji wydaje zamówiony napój. Zakłada się, że w automacie znajdują się napoje 
różnego typu (Coca Cola, Pepsi, Sprite). Automat ma posiadać możliwość wydawania reszty.
 */
package Automat;

/**
 *
 * @author Piotr
 */
public class Napoj {
    int numer;
    String nazwa;
    double cena;
    Napoj(int i, String n, double c)
    {
        this.numer = i;
        this.nazwa = n;
        this.cena = c;
    }
    double getCena()
    {
        return this.cena;
    }
    String getNazwa()
    {
        return this.nazwa;
    }
    int getId()
    {
        return this.numer;
    }
    public String toString()
    {
        return "nr: ( "+ numer + ", " + nazwa + ", " + cena +")";
    }
    
}
