package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("- Stara kolekcija - ");
        List<String> imena=new ArrayList<>();
        imena.add("Mike Tyson");
        imena.add("Prof Keco");
        imena.add("Mohammed Hijab");
        KolekcijaImena k= new KolekcijaImena();
        k.setImenaIPrezimena(imena);

        String max= k.getNajduzeIme();
        System.out.println("Najduze ime: "+max);

        Pobjednik neko=new Pobjednik(k);
        System.out.println("Ime: "+neko.getIme());
        System.out.println("Prezime: "+neko.getPrezime());
        System.out.println("Broj znakova: "+neko.getBrojZnakova());

        System.out.println("\n- Nova kolekcija -");
        KolekcijaImenaIPrezimena kolekc=new KolekcijaImenaIPrezimena();
        List<String>i=new ArrayList<>();
        List<String>p=new ArrayList<>();
        i.add("Mike");
        i.add("Prof");
        i.add("Mohammed");
        p.add("Tyson");
        p.add("Keco");
        p.add("Hijab");
        kolekc.setImena(i);
        kolekc.setPrezimena(p);
        String max2=kolekc.getImeiPrezime(kolekc.getIndexNajduzegPara());
        System.out.println("Najduzi par: "+max2);

        List<String>im=kolekc.getImena();
        List<String>pr=kolekc.getPrezimena();
        List<String>zajedno=new ArrayList<>();
        for(int j=0;j<im.size();j++) {
            zajedno.add(im.get(j)+" "+pr.get(j));
        }
        KolekcijaImena k2=new KolekcijaImena();
        k2.setImenaIPrezimena(zajedno);
        Pobjednik neko2=new Pobjednik(k2);
        System.out.println("Ime: "+neko2.getIme());
        System.out.println("Prezime: "+neko2.getPrezime());
        System.out.println("Broj znakova: "+neko2.getBrojZnakova());




    }
}
