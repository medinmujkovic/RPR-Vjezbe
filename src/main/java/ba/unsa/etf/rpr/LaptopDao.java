package ba.unsa.etf.rpr;

import java.util.ArrayList;

public abstract class LaptopDao {
    public abstract void dodajLaptopUListu(Laptop laptop);
    public abstract void dodajLaptopUFile(Laptop laptop);
    public abstract Laptop getLaptop(String procesor);
    public abstract void napuniListu(ArrayList<Laptop> laptopi);
    public abstract void vratiPodatkeIzDatoteke();
}
