package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;


public class ZadatakSaListama {
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
        System.out.println("Max: " + Max(lista));
        System.out.println("Min: " + Min(lista));
        System.out.println("Mean: " + Mean(lista));
        System.out.println("Devijacija: " + standardnaDevijacija(lista));
    }
    public static double Max(List<Integer>lista)
    {
        int max=Integer.MIN_VALUE;
        for (int i:lista)
        {
            if (max<i)
            {
                max=i;
            }
        }
        return max;
    }
    public static double Min(List<Integer>lista)
    {
        int min=Integer.MAX_VALUE;
        for (int i:lista)
        {
            if (min>i)
            {
                min=i;
            }
        }
        return min;
    }
    public static double Mean (List<Integer>lista)
    {
        double mean=0;
        for(int i:lista)
        {
            mean+=i;
        }
        mean/=lista.size();
        return mean;
    }
    public static double standardnaDevijacija(List<Integer>lista)
    {
        double devijacija = 0.0;
        double mean=Mean(lista);
        for (double i : lista) {
            devijacija += (i-mean)*(i-mean);
        }
        return devijacija;
    }


}