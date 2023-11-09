package ba.unsa.etf.rpr;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class LaptopDaoSerializableFile extends LaptopDao {
    private File file;
    private ArrayList<Laptop> laptopi;
    private int n;
    private double x;
    private double str;

    public LaptopDaoSerializableFile(File file, ArrayList<Laptop> laptopi) throws IOException {
        this.file = new File("/src/main/java/ba/unsa/etf/rpr");
        this.laptopi=laptopi;

        DataOutputStream izlaz = new DataOutputStream(new OutputStream() {
            public void write(int b) throws IOException {
                System.out.println("Datoteka izlaz.txt se ne može otvoriti");
            }
        });
        izlaz.writeDouble(x);
        izlaz.writeInt(n);
        izlaz.writeBytes(String.valueOf(str));
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {

    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {

    }

    @Override
    public Laptop getLaptop(String procesor) {
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public void vratiPodatkeIzDatoteke() {

    }
}
