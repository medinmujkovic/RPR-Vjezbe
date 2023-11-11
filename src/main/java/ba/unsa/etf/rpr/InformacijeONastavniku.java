package ba.unsa.etf.rpr;

import java.util.List;

public class InformacijeONastavniku extends LicneInformacije implements MozeOcijeniti{
    private String ime,prezime,titula;
    private List<Ocjena> ocjene;

    public List<Ocjena> getOcjene() {
        return ocjene;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public Ocjena ocijeni(int x) {
        Ocjena novaOcjena = new Ocjena(new LicneInformacije(), x);
        return novaOcjena;
    }
}
