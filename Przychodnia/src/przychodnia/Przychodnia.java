/*
* Napisz (obiektowo) program (za pomocą list) związany z obsługą typowej
* przychodni. Program musi funkcjonować na zasadzie bazy danych, przy
* czym potrzebne informacje związane z funkcjonowaniem przychodni
* muszą być zapisywane w osobnych plikach tekstowych.
 */
package przychodnia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Piotr
 */
public class Przychodnia {
    Przychodnia()
    {}

    public String wizyta(Lekarz lek, Pacjent pac, String data)
    {
        return "Pacjent: "+pac.getImie()+" "+pac.getNazwisko()+" umowiony/a w dniu "+data+" z doktorem "+lek.getImie()+" "+lek.getNazwisko();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {


        // Skasowanie poprzednio utworzonych plików
        try
        {
            File file = new File("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Lekarze.txt");
            File file2 = new File("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Pacjenci.txt");
            File file3 = new File("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Wizyty.txt");
            if(file.delete() || file2.delete() || file3.delete())
                System.out.println(file.getName() + " zostal skasowany!\n"+file2.getName() +" zostal skasowany!\n"+file3.getName() +" zostal skasowany!" );
            else
                System.out.println("Operacja kasowania sie nie powiodla.");
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        //Utworzenie nowych plików

        try {

            File file = new File("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Lekarze.txt");
            File file2 = new File("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Pacjenci.txt");
            File file3 = new File("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Wizyty.txt");
            if (file.createNewFile() || file2.createNewFile() || file3.createNewFile())
                System.out.println("Pliki zostaly stworzone!");
            else
                System.out.println("Plik juz istnieje");
            }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        // TODO code application logic here
        FileWriter plik = new FileWriter("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Lekarze.txt",true);
        FileWriter plik2 = new FileWriter("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Pacjenci.txt",true);
        FileWriter plik3 = new FileWriter("C:/Users/Piotr/Documents/GitHub/Lab_5/Przychodnia/Wizyty.txt",true);
        BufferedWriter bufor = new BufferedWriter(plik);
        BufferedWriter bufor2 = new BufferedWriter(plik2);
        BufferedWriter bufor3 = new BufferedWriter(plik3);

        Przychodnia przychodnia = new Przychodnia();
        ArrayList<Lekarz> tab_lek = new ArrayList<>();
        ArrayList<Pacjent> tab_pac = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Scanner input = new Scanner(System.in);
        Date data;
        String date = "25-11-2018";
        data = new SimpleDateFormat("yyyy-MM-dd").parse(date);

        //Dodawanie obiektów do tablic
        tab_lek.add(new Lekarz("Pawel", "Domagala", new Adres("Kreta", 2,"Wloclawek", 87800), "Anastezjolog"));
        tab_lek.add(new Lekarz("Adam", "Klan", new Adres("Góralska", 224,"Gdansk", 80176), "Kardiolog"));
        tab_lek.add(new Lekarz("Jan", "Kowal", new Adres("Jasieniowa", 12,"Gdynia", 72080), "Okulista"));
        tab_lek.add(new Lekarz("Ola", "Chwast", new Adres("Smocza", 8,"Sopot", 80800), "Psychiatra"));

        tab_pac.add(new Pacjent("Kasia", "Mueller", new Adres("Grunwaldzka", 77,"Pruszcz", 12730)));
        tab_pac.add(new Pacjent("Basia", "Klose", new Adres("Bankowa", 11,"Słupsk", 33336)));
        tab_pac.add(new Pacjent("Asia", "Heinrisch", new Adres("Pocztowa", 28,"Kartuzy", 22220)));
        tab_pac.add(new Pacjent("Iza", "Bruner", new Adres("Kwiatowa", 18,"Stargard", 17800)));

        for(int i=0; i<tab_lek.size();i++)
        {
        try
            {
                bufor.write(tab_lek.get(i).toString());
                bufor.newLine();

            }
            catch(IOException e)
                    {
                        System.out.println("Brak pliku!");
                    }
        }
        bufor.close();


        for(int i=0; i<tab_lek.size();i++)
        {
        try
            {
                bufor2.write(tab_pac.get(i).toString());
                bufor2.newLine();

            }
        catch(IOException e)
                    {
                        System.out.println("Brak pliku!");
                    }
        }
        bufor2.close();

        String s;
        int x,y;
        System.out.println("Czy chcesz umowic wizyte? y/n");
        s = input.next();
        while(s.equals("y"))
        {
        System.out.println("Wpisz numer lekarza");
        x = input.nextInt();
        System.out.println("Wpisz numer pacjenta");
        y = input.nextInt();
        System.out.println("Wpisz date (dd-MM-yyyy)");
        date = input.next();
        try
            {
                bufor3.write(przychodnia.wizyta(tab_lek.get(x), tab_pac.get(y), date));
                bufor3.newLine();
                System.out.println(przychodnia.wizyta(tab_lek.get(x), tab_pac.get(y), date));
            }
            catch(IOException e)
                    {
                        System.out.println("Brak pliku!");
                    }
        System.out.println("Czy chcesz umowic kolejna wizyte? y/n");
        s = input.next();
        }
        bufor3.close();
    }


    }







