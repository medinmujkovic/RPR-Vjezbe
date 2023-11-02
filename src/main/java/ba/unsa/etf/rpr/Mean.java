package ba.unsa.etf.rpr;
import java.util.List;

public class Mean {
    public static double Mean(List<Integer> lista) {
        double mean = 0;
        for (int i : lista) {
            mean += i;
        }
        mean /= lista.size();
        return mean;
    }
}