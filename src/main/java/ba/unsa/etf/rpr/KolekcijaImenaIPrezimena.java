package ba.unsa.etf.rpr;

import java.util.List;

public class KolekcijaImenaIPrezimena {
    private List<String>imena;
    private List<String> prezimena;

    public int getIndexNajduzegPara()
    {
        String max=imena.get(0)+prezimena.get(0);
        int index=0;
        for(int i=0;i<imena.size();i++)
        {
            if(max.length()<(imena.get(i).length()+prezimena.get(i).length()))
            {
                max=imena.get(i)+prezimena.get(i);
                index=i;
            }
        }
        return index;
    }

    public String getImeiPrezime(int i)
    {
        String temp=imena.get(i)+" "+prezimena.get(i);
        return temp;
    }

    public void setImena(List<String> imena) {
        this.imena = imena;
    }

    public void setPrezimena(List<String> prezimena) {
        this.prezimena = prezimena;
    }

    public List<String> getImena() {
        return imena;
    }

    public List<String> getPrezimena() {
        return prezimena;
    }
}
