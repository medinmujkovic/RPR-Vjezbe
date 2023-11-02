package ba.unsa.etf.rpr;
import java.util.List;

public class Min {
    public static double Min(List<Integer> lista) {
        int min = Integer.MAX_VALUE;
        for (int i : lista) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}