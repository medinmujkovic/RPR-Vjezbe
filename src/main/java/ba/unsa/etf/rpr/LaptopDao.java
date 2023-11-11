package ba.unsa.etf.rpr;

import java.io.IOException;
import java.util.ArrayList;

public abstract class LaptopDao {
    public abstract void dodajLaptopUListu(Laptop laptop);
    public abstract void dodajLaptopUFile(Laptop laptop) throws IOException;
    public abstract Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException;
    public abstract void napuniListu(ArrayList<Laptop> laptopi);
    public abstract ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException;
}
