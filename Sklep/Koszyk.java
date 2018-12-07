/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sklep;

/**
 *
 * @author Piotr
 */
public class Koszyk extends Magazyn {
    double suma;
    Koszyk(String n, double c, int i, double suma)
    {
        super(n,c,i);
        this.suma = suma;
    }

    public double sumaZakupow()
    {
        
        return this.suma;
    }
    
}
