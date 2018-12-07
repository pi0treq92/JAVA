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
public class Adres {
    String ulica;
    int numer;
    String miasto;
    int kod;
    Adres()
    {}
    Adres(String ulica, int numer, String miasto, int kod)
    {
        this.ulica = ulica;
        this.numer = numer;
        this.miasto = miasto;
        this.kod = kod;
    }
    
    String getUlica()
    {
        return ulica;
    }
    int getNr()
    {
        return numer;
    }
    
    String getMiasto()
    {
        return miasto;
    }
    
    long getKod()
    {
        return kod;
    }
    
    @Override
    public String toString()
    {
        return this.ulica+", "+this.numer+", "+this.miasto+", "+this.kod;
    }
}
