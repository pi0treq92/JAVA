/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprogram;

import java.text.DecimalFormat;

/**
 *
 * @author Piotr
 */
public class Product {
    String name;
    double price;
    double vat;
    int id;
    
    Product()
    {        
    }
    
    Product(String name, double price, double vat, int id)
    {
        this.name = name;
        this.price = price;
        this.vat = vat;
        this.id = id;
    }
    
    String getName()
    {
        return name;
    }
    
    double getGross()
    {
        double t;
        t = Math.round((this.price+this.price*this.vat)*100d)/100d;
        
        return t;
    }
    int getVAT()
    {
        double a = vat*100;
        int i = (int) a;
        return i;
    }
    double getNet()
    {
        return price;
    }
    
    @Override
    public String toString()
    {
        return "Produkt(" + "Name: "+ name 
                +", "+"Price: "+ price+" zł"
                +", "+"Vat: "+getVAT()+"%"
                +", "+"Cena brutto = "+ getGross()+" zł"+" )";
    }
    
    
}
