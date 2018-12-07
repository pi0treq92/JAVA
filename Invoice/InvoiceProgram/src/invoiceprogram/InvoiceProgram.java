/*
 * Napisz program, w którym można:
 * - dodawać produkty do magazynu
 * - usuwać produkty z magazynu
 * - wystawiac faktury na zakupione produkty
 */
package invoiceprogram;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Piotr
 */
public class InvoiceProgram {

    /**4
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ArrayList <InvoiceVat> invoice = new ArrayList<>();
        ArrayList <Product> lista = new ArrayList<>();

        lista.add(new Product("Kiwi", 1.5, 0.23, 1));
        lista.add(new Product("Jablko", 0.75, 0.23, 3));
        lista.add(new Product("Papier", 2, 0.23, 2));
        lista.add(new Product("Piwo", 3.5, 0.23, 4));
        Customer Piotr = new Customer("Piotr", "Migdalski", "9670304040", "Kręta");
        invoice.add(new InvoiceVat("2018-01-01", "2018-02-17", "2019-03-19", Piotr, lista));
        System.out.println(invoice);


    }

}
