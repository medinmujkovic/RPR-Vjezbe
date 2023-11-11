package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        LicneInformacije ja=new LicneInformacije();
        ja.setPrezime("Mujkovic");
        ja.setIme("Medin");
        System.out.println("Licne informacije: "+ja.getIme()+" "+ja.getPrezime());

        InformacijeONastavniku prof=new InformacijeONastavniku();
        prof.setTitula("van.prof");
        prof.setPrezime("Okanovic");
        prof.setIme("Vensada");
        System.out.println("Informacije o nastavniku: "+prof.getTitula()+" "+prof.getIme()+" "+prof.getPrezime());

        InformacijeOStudentu s=new InformacijeOStudentu();
        s.setIme("Robert");
        s.setPrezime("Oppenheimer");
        s.setBrojIndeksa("19219");
        s.setGodinaStudija("2");
        System.out.println("Informacije o studentu: "+s.getIme()+" "+s.getPrezime()+": Indeks = "+s.getBrojIndeksa()+" Godina studija = "+s.getGodinaStudija());


    }
}
