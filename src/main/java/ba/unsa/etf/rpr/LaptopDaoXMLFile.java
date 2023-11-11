package ba.unsa.etf.rpr;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoXMLFile extends LaptopDao{

    private File file;
    private ArrayList<Laptop> laptopi;

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException{


        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File(String.valueOf(file)),laptop);
//        FileOutputStream fo = new FileOutputStream(file);
//        fo.write(xmlMapper.getBytes());
//        fo.close();
        //assertNotNull(file);
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
        XmlMapper xmlMapper = new XmlMapper();
        LaptopDaoXMLFile value = xmlMapper.readValue(file, LaptopDaoXMLFile.class);
        //assertTrue(value.getX() == 1 && value.getY() == 2);
        if (value != null) {
            return value.laptopi;
        } else {
            System.out.println("No data");
            return new ArrayList<>();
        }
    }
}
