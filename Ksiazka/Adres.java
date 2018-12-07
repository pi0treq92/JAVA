/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ksiazka;

/**
 *
 * @author Piotr
 */
public class Adres extends Ksiazka{
    int zipcode;
    String ulica;
    String miasto;
    Adres(String i, String n, int z, String u, String m)
    {
        super(i, n);
        this.zipcode = z;
        this.ulica = u;
        this.miasto = m;
        
    }
    @Override
    String getName()
    {
        return this.imie;
    }
    @Override
    String getNazwisko()
    {
        return this.nazwisko;
    }
    public String toString()
    {
        return "Adres( "+ imie + ", "+ nazwisko + ", "+ulica + ", "+zipcode + ", "+miasto+")";
    }
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (! (obj instanceof Adres))
			return false;
		
		Adres other = (Adres) obj;
		if (this.getNazwisko().equals(other.getNazwisko()))
			if (this.getName() == other.getName())
				return true;
			else
				return false;
		else
			return false;
}
}
