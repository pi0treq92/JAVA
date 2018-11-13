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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
public class InvoiceVat {
    private Date sale;
    private Date invoiceDate;
    private Date payment;
    int number;
    Product product;
    Customer customer;
    
    ArrayList <Product> lista = new ArrayList<>(); 
    
    
    public InvoiceVat(String sale, String invoiceDate, String payment, Customer customer, ArrayList<Product> lista) throws Exception
    {
        this.sale = new SimpleDateFormat("yyyy-MM-dd").parse(sale);
        this.invoiceDate = new SimpleDateFormat("yyyy-MM-dd").parse(invoiceDate);
        this.payment = new SimpleDateFormat("yyyy-MM-dd").parse(payment);
        this.customer = customer;
        this.lista = lista;
        
    }
    @Override
    public int hashCode()
    {
        number = Objects.hash(sale, invoiceDate, payment);
        return number;
    }
    
    
    public InvoiceVat getProduct(Product product)
    {
        this.product = product;
        return this;
    }
    
    public Customer getCustomer(Customer customer)
    {
        this.customer = customer;
        return customer;
    }
    

    @Override
    public String toString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return "Invoice nr "+hashCode()
                +"\nDate of sale: "+formatter.format(sale)
                +"\nDate of invoice: "+formatter.format(invoiceDate)
                +"\nDate of payment: "+formatter.format(payment)
                +"\n"+customer
                +"\n"+lista;
    }
    
}
