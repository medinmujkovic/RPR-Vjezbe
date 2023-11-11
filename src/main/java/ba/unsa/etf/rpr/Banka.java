package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;

public class Banka {
    private long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka() {
        this.korisnici = new ArrayList<Korisnik>();
        this.uposlenici = new ArrayList<Uposlenik>();
    }
    public Korisnik kreirajNovogKorisnika(String ime,String prezime){
        Korisnik korisnik=new Korisnik(ime, prezime);
        return korisnik;
    }
    public Uposlenik kreirajNovogUposlenika(String ime,String prezime){
        Uposlenik uposlenik=new Uposlenik(ime, prezime);
        return uposlenik;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik)
    {
        Racun racun = null;
        for (Korisnik k:korisnici){
            if (k==korisnik){
                racun = new Racun(325324L, k);
            }
        }
        return racun;
    }
}
