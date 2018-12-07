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
public class Pacjent extends Osoba{
    Pacjent(String imie, String nazwisko, Adres adres)
    {
        super(imie, nazwisko, adres);

    }
    
    
     @Override
    public String toString()
    {
        return this.imie+", "+this.nazwisko+", "+
                this.adres.getUlica()+", "+this.adres.getNr()+", "+this.adres.getMiasto()+", "+this.adres.getKod();
        
    }
    
}
