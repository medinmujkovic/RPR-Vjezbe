package ba.unsa.etf.rpr;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Da li si student ili nastavnik?");
        String n=ulaz.nextLine();

        List<Predmet>predmeti = new ArrayList<>();
        List<InformacijeONastavniku>nastavnici=new ArrayList<>();

        Predmet rpr=new Predmet();;
        rpr.setNaziv("RPR");
        rpr.setOpis("Java, Maven, IntelliJ, JavaFX");
        Predmet obp=new Predmet();;
        obp.setNaziv("OBP");
        obp.setOpis("SQL baze podataka");
        Predmet dm=new Predmet();;
        dm.setNaziv("DM");
        dm.setOpis("Kombinatorika, kongurencije, teorija grafova, teorije brojeva...");
        predmeti.add(rpr);
        predmeti.add(obp);
        predmeti.add(dm);

        InformacijeONastavniku juric=new InformacijeONastavniku();
        juric.setIme("Zejko");
        juric.setPrezime("Juric");
        juric.setTitula("red.prof.");
        InformacijeONastavniku buza=new InformacijeONastavniku();
        buza.setIme("Emir");
        buza.setPrezime("Buza");
        buza.setTitula("van.prof");
        InformacijeONastavniku almina=new InformacijeONastavniku();
        almina.setIme("Almina");
        almina.setPrezime("Brulic");
        almina.setTitula("dr.mr");
        nastavnici.add(almina);
        nastavnici.add(buza);
        nastavnici.add(juric);
        LicneInformacije ja=new LicneInformacije();
        ja.setIme("Medin");
        ja.setPrezime("Mujkovic");

        if(n.equals("Nastavnik"))
        {
            for(int i=0;i<predmeti.size();i++) {
                System.out.println("Ocijeni predmet " + predmeti.get(i).getNaziv());
                Scanner unos=new Scanner(System.in);
                int x=unos.nextInt();
                predmeti.get(i).ocijeni(x);

            }
            for (int i=0;i<predmeti.size();i++)
            {
                System.out.println(predmeti.get(i).getNaziv()+" "+predmeti.get(i).getOpis());
                for(int j=0;j<predmeti.get(i).getOcjene().size();i++)
                {
                    System.out.println(predmeti.get(i).getOcjene().get(j));
                }
            }
        }
        else if (n.equals("Student")) {
            for(int i=0;i<predmeti.size();i++) {
                System.out.println("Ocijeni predmet " + predmeti.get(i).getNaziv());
                Scanner unos=new Scanner(System.in);
                int x=unos.nextInt();
                //Ocjena ocjena=new Ocjena(ja,x);
                predmeti.get(i).ocijeni(x);
            }
            for(int i=0;i<nastavnici.size();i++) {
                System.out.println("Ocijeni nastavnika " + nastavnici.get(i).getTitula()+nastavnici.get(i).getIme()+nastavnici.get(i).getPrezime());
                Scanner unos=new Scanner(System.in);
                int x=unos.nextInt();
                //Ocjena ocjena=new Ocjena(ja,x);
                nastavnici.get(i).ocijeni(x);
            }
        }
    }
}
