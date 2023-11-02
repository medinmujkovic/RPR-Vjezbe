package ba.unsa.etf.rpr;

import java.util.List;
public class Max {
    public static double Max(List<Integer> lista) {
        int max = Integer.MIN_VALUE;
        for (int i : lista) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}