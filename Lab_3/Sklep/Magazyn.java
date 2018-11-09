/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sklep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Piotr
 */
public class Magazyn extends Produkt{
    public int ilosc;
    
    Magazyn(String n, double c, int i)
    {
        super(n,c);
        this.ilosc = i;
    }
    
    void dodajProdukt(ArrayList lista, Magazyn n)
    {
        if (lista.contains(n.getNazwa()))
                n.zmienIlosc(this.ilosc);
        
    }
    
    int getIlosc()
    {
        return this.ilosc;
    }
    
    public void zmienIlosc(int i)
    {
        int dostawa = ilosc + i;
        ilosc = dostawa;
    }
    public void zdejmijZmagazynu(int i)
    {
        int dostawa = ilosc - i;
        ilosc = dostawa;
    }
    
    public boolean equals(Object other)
    {
        if(this == other)
            return true;
        if(other == null)
            return false;
        if (getClass() !=other.getClass())
            return false;
        Magazyn otherobj = (Magazyn) other;
        return Objects.equals(nazwa, otherobj.nazwa);
    }
    
    public void dodawanie(ArrayList lista, Magazyn n)
    {
        if (n.equals(this))
                this.zmienIlosc(n.getIlosc());
        else
            lista.add(n);
    }
    @Override
    public String toString()
    {
        return "Produkt["+nazwa+", "+ cenaHurt+", "+ ilosc +"]";
    }
    
}
    

