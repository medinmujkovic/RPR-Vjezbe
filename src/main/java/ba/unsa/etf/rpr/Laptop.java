package ba.unsa.etf.rpr;

public class Laptop {
    private String brend,model,procesor,grafickaKartica;
    private double cijena,velicinaEkrana;
    private int ram,hdd,sdd;

    public Laptop(String brend, String model, String procesor, String grafickaKartica, double cijena, double velicinaEkrana, int ram, int hdd, int sdd) {
        this.brend = brend;
        this.model = model;
        this.procesor = procesor;
        this.grafickaKartica = grafickaKartica;
        this.cijena = cijena;
        this.velicinaEkrana = velicinaEkrana;
        this.ram = ram;
        this.hdd = hdd;
        this.sdd = sdd;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getGrafickaKartica() {
        return grafickaKartica;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getSdd() {
        return sdd;
    }

    public void setSdd(int sdd) {
        this.sdd = sdd;
    }
}
