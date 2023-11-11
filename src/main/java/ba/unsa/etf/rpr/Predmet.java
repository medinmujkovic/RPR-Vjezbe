package ba.unsa.etf.rpr;

import java.util.List;

public class Predmet implements MozeOcijeniti{
    private String naziv,opis;
    private List<Ocjena> ocjene;

    public List<Ocjena> getOcjene() {
        return ocjene;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public Ocjena ocijeni(int x) {
        Ocjena novaOcjena = new Ocjena(new LicneInformacije(), x);
        ocjene.add(novaOcjena);
        return novaOcjena;
    }
}
