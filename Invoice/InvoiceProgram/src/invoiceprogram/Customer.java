/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceprogram;

/**
 *
 * @author Piotr
 */
public class Customer {
    String name;
    String lastname;
    String nip;
    String adres;
    
    Customer(String name, String lastname, String nip, String adres)
    {
        this.name = name;
        this.lastname = lastname;
        this.nip = nip;
        this.adres = adres;
    }
    
    public String getName()
    {
        return name;
    }
    public String getLastName()
    {
        return lastname;
    }
    public String getNip()
    {
        return nip;
    }
    public String getadres()
    {
        return adres;
    }
    
    @Override
    public String toString()
    {
       return "Customer( \nName: "+name
               +"\nLast Name: "+lastname
               +"\nNIP: "+nip
               +"\nAdress: "+adres+")"; 
    }
}
