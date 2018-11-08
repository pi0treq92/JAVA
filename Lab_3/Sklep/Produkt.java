/*
Zad 31
Napisz (obiektowo) program „Sklep”. Program ma wspierać obsługę 
sklepu dowolnie wybranego rodzaju. Powinna być możliwość 
przyjęcia towaru do sklepu oraz jego sprzedaż w sposób hurtowy i 
detaliczny. „Sprzedaż” ma polegać na wybieraniu towarów do 
koszyka (bez rejestrowania klientów) i naliczaniu zbiorczej
 */
package Sklep;

/**
 *
 * @author Piotr
 */
public class Produkt {
    String nazwa;
    double cenaDet;
    double cenaHurt;
    final double VAT = 0.23;
    
    public Produkt(String n, double cena)
    {
        this.nazwa = n;
        this.cenaHurt = cena;
    }
    
    double getcenaDet()
    {
        return this.cenaDet = getcenaHurt()+getcenaHurt()*VAT;
    }
    
    double getcenaHurt()
    {
        return this.cenaHurt;
    }
    
    String getNazwa()
    {
        return this.nazwa;
    }
    
}
