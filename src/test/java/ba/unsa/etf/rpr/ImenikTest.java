package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Map;

import static ba.unsa.etf.rpr.Program.imenik;
import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    @Test
    void dodaj() {
        assertThrows(BrojException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new
            }
        });
    }

    @Test
    void dajImeFound() {
        String broj=imenik.dajIme("225-883");
        assertEquals(broj, "Amar");
    }

    @Test
    void dajImeNotFound() {
        String broj=imenik.dajIme("225-883");
        assertEquals(broj, "Amar");
    }
}