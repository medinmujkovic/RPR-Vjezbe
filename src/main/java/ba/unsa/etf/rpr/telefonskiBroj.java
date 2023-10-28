package ba.unsa.etf.rpr;
abstract class telefonskiBroj {
    public static String ispisi() {
        return null;
    }

    public abstract int hashCode();
}

class FiksniBroj extends telefonskiBroj{
    protected String broj;
    protected enum Grad{Sarajevo,Tuzla,Zenica}
    protected Grad grad;

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public FiksniBroj(Grad grad,String broj) {
        this.grad = grad;
        this.broj = broj;
    }

}

class MobilniBroj extends telefonskiBroj{
    protected int mobilnaMreza;
    protected String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

class MedunarodniBroj extends telefonskiBroj{
    protected String Drzava,broj;

    public MedunarodniBroj(String drzava, String broj) {
        Drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
