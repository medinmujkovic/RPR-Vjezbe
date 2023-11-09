package ba.unsa.etf.rpr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoJSONFile extends LaptopDao {

    private File file;
    private ArrayList<Laptop> laptopi;
    public void save(Object object) throws IOException
    {
        Laptop ow = new ObjectMapper().writer();
        String json = ow.writeValueAsString(object);
        FileOutputStream fo = new FileOutputStream(new File("myfile.json" ));
        fo.write(json.getBytes());
        fo.close();
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
