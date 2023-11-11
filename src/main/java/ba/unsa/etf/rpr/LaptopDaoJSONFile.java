package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoJSONFile extends LaptopDao {

    public File file;
    public ArrayList<Laptop> laptopi;

    public LaptopDaoJSONFile(File file, ArrayList<Laptop> laptopi) {
        this.file = file;
        this.laptopi = laptopi;
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException{
        ObjectWriter ow = new ObjectMapper().writer();
        String json = ow.writeValueAsString(laptop);
        FileOutputStream fo = new FileOutputStream(new File(String.valueOf(file)));
        fo.write(json.getBytes());
        fo.close();
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
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<Laptop> listaLap = objectMapper.readValue(file, new TypeReference<ArrayList<Laptop>>() {
        });
        return listaLap;
    }
}
