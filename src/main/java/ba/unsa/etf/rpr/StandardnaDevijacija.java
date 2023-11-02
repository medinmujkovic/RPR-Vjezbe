package ba.unsa.etf.rpr;

import java.util.List;

public class StandardnaDevijacija {
    public static double StandardnaDevijacija(List<Integer> lista) {
        double devijacija = 0.0;
        double mean = Mean.Mean(lista);
        for (double i : lista) {
            devijacija += (i - mean) * (i - mean);
        }
        return devijacija;
    }
}