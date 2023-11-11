package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile extends LaptopDao {
    private File file;
    private ArrayList<Laptop> laptopi;

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        file=new File("/src/main/java/ba/unsa/etf/rpr");
        try (ObjectOutputStream izlaz = new ObjectOutputStream(new FileOutputStream(file))) {
            izlaz.writeObject(laptopi);
            izlaz.close();
        } catch (IOException e) {
            System.out.println("Greška: "+e);
        }
    }

    @Override
    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {
        for (Laptop laptop : laptopi) {
            if (laptop.getProcesor().equals(procesor)) {
                return laptop;
            }
        }
        throw new NeodgovarajuciProcesorException("Laptop sa procesorom "+procesor+" nije pronadjen");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi=laptopi;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() {
        ArrayList<Laptop> listaLap = new ArrayList<>();

        try (ObjectInputStream ulaz = new ObjectInputStream(new FileInputStream(file))) {
            listaLap = (ArrayList<Laptop>) ulaz.readObject();
            ulaz.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Greška: "+e);
        }

        return listaLap;
    }
}
