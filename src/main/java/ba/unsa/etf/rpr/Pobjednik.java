package ba.unsa.etf.rpr;

import java.util.StringTokenizer;

public class Pobjednik {
    private String ime,prezime;
    private int brojZnakova;
    private KolekcijaImena kolekcijaImena;

    public Pobjednik(KolekcijaImena kolekcijaImena) {
        this.kolekcijaImena = kolekcijaImena;
        String najduzeIme=kolekcijaImena.getNajduzeIme();
        StringTokenizer tokenizer = new StringTokenizer(najduzeIme);
        this.ime=tokenizer.nextToken();
        this.prezime= tokenizer.nextToken();
        this.brojZnakova = this.ime.length();

    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojZnakova() {
        return brojZnakova;
    }

}
