package ba.unsa.etf.rpr;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna,prekoracenje;

    public Racun(Long brojRacuna, Osoba korisnikRacuna){
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }

    private boolean provjeriOdobrenjePrekoracenja (Double stanjeRacuna){
        return this.prekoracenje>stanjeRacuna;
    }

    public boolean izvrsiUplatu (Double i)
    {
        this.stanjeRacuna+=i;
        return true;
    }
    public boolean izvrsiIsplatu (Double i)
    {
        if(provjeriOdobrenjePrekoracenja(i)) {
            this.stanjeRacuna-=i;
            return true;
        }
        return false;
    }
    public void odobriPrekoracenje (Double i)
    {
        this.prekoracenje=i;
    }



}
