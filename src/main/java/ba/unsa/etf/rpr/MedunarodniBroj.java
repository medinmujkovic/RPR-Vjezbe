package ba.unsa.etf.rpr;

import java.util.Objects;

class MedunarodniBroj extends TelefonskiBroj {
    private String Drzava, broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.Drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return Drzava + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Drzava,broj);
    }
}
