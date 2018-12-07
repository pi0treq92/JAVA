/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Piotr
 */
public class Customer {
    String name;
    String lastName;
    String Pesel;
    float konto;
    Date date;
    SimpleDateFormat sample;
    
    Customer()
    {}
    Customer(String name, String lastName, String Pesel, float konto, Date date)
    {
      this.name = name;
      this.lastName = lastName;
      this.Pesel = Pesel;
      this.konto = konto;
      this.date = date;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setPesel(String Pesel)
    {
        this.Pesel = Pesel;
    }
    public void setKonto(float konto)
    {
        this.konto = konto;
    }
    
    public void setDate(Date date)
    {
        this.date = date;
    }
    String urodziny(Date date)
    {
        int day= date.getDate();
        int month = date.getMonth();
        int year = date.getYear();
        return day+"-"+month+"-"+year;
    }
    
    boolean checkName()
    {
        if (this.name.length()>2)
            return this.name.matches("[a-zA-Z]+");
        else return false;
    }
    
    boolean checkLastName()
    {
      if (this.lastName.length()>2)
            return this.lastName.matches("[a-zA-Z]+");
        else return false;
    }
    
    boolean checkDate()
    {
        return false;
    }
    
    public String toString()
    {
        return "Imie: "+this.name+ 
                "\nNazwisko: "+this.lastName+
                "\nPesel: "+ this.Pesel+
                "\nData urodzenia: "+ urodziny(date)+
                "\nNr konta: "+this.konto;
    }
    
}