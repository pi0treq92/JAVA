/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przychodnia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Piotr
 */
public class Lekarz extends Osoba {
    String specjalizacja;
    
    
    
    Lekarz(String imie, String nazwisko, Adres adres, String specjalizacja)
    {
        super(imie, nazwisko, adres);
        this.specjalizacja = specjalizacja;
    }
    
    
     @Override
    public String toString()
    {
        return this.imie+", "+this.nazwisko+", "+this.specjalizacja+", "+
                this.adres.getUlica()+", "+this.adres.getNr()+", "+this.adres.getMiasto()+", "+this.adres.getKod();
        
    }
    
}
