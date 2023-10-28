package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;

public class Banka {
    private long brojRacuna;
    public Banka(){}
    public List<Korisnik> kreirajNovogKorisnika(String ime,String prezime){
        List<Korisnik>korisnici=new ArrayList<Korisnik>();
        return korisnici;
    }
    public List<Korisnik> kreirajNovogKorisnika(String ime,String prezime){
        List<Korisnik>korisnici=new ArrayList<Korisnik>();
        return korisnici;
    }
    public List<Uposlenik> kreirajNovogUposlenika(String ime,String prezime){
        List<Uposlenik>uposlenici=new ArrayList<Uposlenik>();
        return uposlenici;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik)
    {
        Racun racun(dodajRacun(Racun racun),korisnik);
        return racun;
    }
}
