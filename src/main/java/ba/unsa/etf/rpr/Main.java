package ba.unsa.etf.rpr;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NeodgovarajuciProcesorException, IOException {

        Laptop laptopPrvi=new Laptop("Dell", "Inspirion 15 3000", "Intel i5", "Intel® Iris® Xᵉ Graphics",
            1599.99, 35.56,
            16,0,200);

        Laptop laptopDrugi=new Laptop("HP", "HP SPECTRE FOLDABLE PC 17", "Intel i7", "Intel® Iris® Xᵉ Graphics",
                523.42,37.21,
                8,1000,0);

        Laptop laptopTreci=new Laptop("Lenovo", "ThinkPad X1 Carbon", "AMD Ryzen 5", "GTX 1050",
                1350.00,23.45,
                4,200,300);

        //Serializable txt File
        File file= new File("src/main/java/ba/unsa/etf/rpr/serFile.txt");
        LaptopDaoSerializableFile serFile = new LaptopDaoSerializableFile(file,new ArrayList<>());
        serFile.dodajLaptopUListu(laptopPrvi);
        serFile.dodajLaptopUListu(laptopDrugi);
        serFile.dodajLaptopUListu(laptopTreci);
        serFile.dodajLaptopUFile(serFile.laptopi.get(0));
        serFile.dodajLaptopUFile(serFile.laptopi.get(1));
        serFile.dodajLaptopUFile(serFile.laptopi.get(2));
        serFile.napuniListu(serFile.laptopi);
        serFile.getLaptop("Intel i5");
        ArrayList<Laptop> serFileLaptops = serFile.vratiPodatkeIzDatoteke();

        //JSONFile
        File file2= new File("src/main/java/ba/unsa/etf/rpr/jsonFile.json");
        LaptopDaoJSONFile jsonFile = new LaptopDaoJSONFile(file2,new ArrayList<>());
        jsonFile.dodajLaptopUListu(laptopPrvi);
        jsonFile.dodajLaptopUListu(laptopDrugi);
        jsonFile.dodajLaptopUListu(laptopTreci);
        jsonFile.dodajLaptopUFile(jsonFile.laptopi.get(0));
        jsonFile.dodajLaptopUFile(jsonFile.laptopi.get(1));
        jsonFile.dodajLaptopUFile(jsonFile.laptopi.get(2));
        jsonFile.napuniListu(jsonFile.laptopi);
        jsonFile.getLaptop("Intel i7");
        ArrayList<Laptop> jsonFileLaptops = jsonFile.vratiPodatkeIzDatoteke();

        //XMLFile
        File file3= new File("src/main/java/ba/unsa/etf/rpr/xmlFile.xml");
        LaptopDaoXMLFile xmlFile = new LaptopDaoXMLFile(file3,new ArrayList<>());
        xmlFile.dodajLaptopUListu(laptopPrvi);
        xmlFile.dodajLaptopUListu(laptopDrugi);
        xmlFile.dodajLaptopUListu(laptopTreci);
        xmlFile.dodajLaptopUFile(xmlFile.laptopi.get(0));
        xmlFile.dodajLaptopUFile(xmlFile.laptopi.get(1));
        xmlFile.dodajLaptopUFile(xmlFile.laptopi.get(2));
        xmlFile.napuniListu(xmlFile.laptopi);
        xmlFile.getLaptop("AMD Ryzen 5");
        ArrayList<Laptop> xmlFileLaptops = xmlFile.vratiPodatkeIzDatoteke();


        for (Laptop laptop : serFileLaptops) {
            System.out.println(laptop);
        }

        for (Laptop laptop : jsonFileLaptops) {
            System.out.println(laptop);
        }

        for (Laptop laptop : xmlFileLaptops) {
            System.out.println(laptop);
        }
    }
}
