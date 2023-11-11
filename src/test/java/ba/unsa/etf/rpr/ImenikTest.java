package ba.unsa.etf.rpr;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Map;

import static ba.unsa.etf.rpr.Program.imenik;
import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    @BeforeAll
    public static void setup(){
        imenik.dodaj("Amar", new FiksniBroj(Grad.SARAJEVO, "225-883"));
        imenik.dodaj("Almina", new FiksniBroj(Grad.SARAJEVO, "245-123"));
    }
    @Test
    void dodajPositive() {
        TelefonskiBroj broj = new MobilniBroj(61, "507-855");
        imenik.dodaj("Jure", broj);
        String brojStr = imenik.dajBroj("Jure");
        assertEquals(brojStr, "061/507-855");
    }

    @Test
    void dajImeFound() {
        String ime=imenik.dajIme(new FiksniBroj(Grad.SARAJEVO, "245-123"));
        assertEquals(ime, "Almina");
    }

    @Test
    void dajImeNotFound() {
        String ime=imenik.dajIme(new FiksniBroj(Grad.SARAJEVO, "245-432"));
        assertNull(ime);
    }
}