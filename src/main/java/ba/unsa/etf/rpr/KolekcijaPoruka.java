package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaPoruka {
    private List<String> poruke;

    public KolekcijaPoruka(List<MetodaPredstavi> metode) {
        for (int i=0;i<poruke.size();i++) {
           poruke.set(i, metode.get(i).predstavi());
        }
    }

    public List<String> getPoruke() {
        return poruke;
    }

}
