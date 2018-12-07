/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przychodnia;

/**
 *
 * @author Piotr
 */
public class Osoba extends Adres{
    String imie;
    String nazwisko;
    Adres adres;
    private static int id;
    
    Osoba(String imie, String nazwisko, Adres adres)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        
    }
    
    String getImie()
    {
        return this.imie;
    }
    
    
    String getNazwisko()
    {
        return this.nazwisko;
    }
    
    @Override
    public String toString()
    {
        return this.imie+", "+this.nazwisko+","+adres.getUlica()+", "+adres.getNr()+", "+adres.getMiasto()+", "+adres.getKod();
    }
            
    
}
