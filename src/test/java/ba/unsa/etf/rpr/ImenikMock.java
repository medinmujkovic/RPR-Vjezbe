package ba.unsa.etf.rpr;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Map;
import org.mockito.Mockito;

import static ba.unsa.etf.rpr.Program.imenik;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ImenikMock {

    private static Imenik imenik = new Imenik();

    @BeforeAll
    public static void setup(){
        imenik.dodaj("Amar", new FiksniBroj(Grad.SARAJEVO, "225-883"));
        imenik.dodaj("Almina", new FiksniBroj(Grad.SARAJEVO, "245-123"));
    }

    @Test
    public void testMockDajBroj(){
        Imenik i = Mockito.mock(Imenik.class);
        Mockito.when(i.dajIme(new FiksniBroj(Grad.SARAJEVO, "245-123"))).thenReturn("Nema nista");

        String test = i.dajIme(new FiksniBroj(Grad.SARAJEVO, "245-123"));
        assertEquals(test, null);
    }

    @Test
    public void testMockMapa(){
        Map<String, TelefonskiBroj> mapa = Mockito.mock(Map.class);
        Mockito.when(mapa.get("Almina")).thenReturn(new FiksniBroj(Grad.SARAJEVO, "245-123"));
        imenik.setBrojevi(mapa);

        String broj = imenik.dajBroj("Almina");
        assertNotEquals(broj, "035/245-123");
        assertEquals(broj, "033/245-123");
    }
}
