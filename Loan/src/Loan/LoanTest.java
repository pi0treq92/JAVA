/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loan;

import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Piotr
 */
public class LoanTest {
    public static void main(String[] args){
        BigInteger n;
        
        Date d = new GregorianCalendar(1992,03,19).getTime();
        float konto = 27139712;
        String Pesel = "92031900215";
        String name = "Piotr";
        String lastName = "Migdalski";
    Customer pierwszy = new Customer();
    pierwszy.setDate(d);
    pierwszy.setName(name);
    pierwszy.setLastName(lastName);
    pierwszy.setPesel(Pesel);
    pierwszy.setKonto(konto);
        System.out.println(pierwszy.toString());
    
    
    
        //System.out.println(pierwszy.checkLastName());
        System.out.println(pierwszy.checkName());
    }
}
