package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();

        for(int i=0;;i++)
        {
            String n=ulaz.nextLine();
            if (n.equals("stop")) break;
            try {
                lista.add(parseInt(n));
            }
            catch(Exception e)
            {
                System.out.println("Ponovi unos");
            }
        }
        System.out.println("List: " + lista);
        System.out.println("Max: " + Max.Max(lista));
        System.out.println("Min: " + Min.Min(lista));
        System.out.println("Mean: " + Mean.Mean(lista));
        System.out.println("Devijacija: " + StandardnaDevijacija.StandardnaDevijacija(lista));
    }
}