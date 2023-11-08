package ba.unsa.etf.rpr;

import java.util.Objects;

class FiksniBroj extends TelefonskiBroj {
    private String broj;
    private Grad grad;
    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }
    @Override
    public String ispisi() {
        return grad.getPozivniBroj()+"/"+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad,broj);
    }


    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }
}
