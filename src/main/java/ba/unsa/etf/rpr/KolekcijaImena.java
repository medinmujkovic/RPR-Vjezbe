package ba.unsa.etf.rpr;

import java.util.List;

public class KolekcijaImena {
    private List<String>imenaIPrezimena;

    public String getNajduzeIme()
    {
        String max= this.imenaIPrezimena.get(0);
        for(String i:this.imenaIPrezimena)
        {
            if(max.length()<i.length()) max=i;
        }
        return max;
    }

    public void setImenaIPrezimena(List<String> imenaIPrezimena) {
        this.imenaIPrezimena = imenaIPrezimena;
    }
}
