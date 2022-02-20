package zaposleni;

import java.time.LocalDate;
import java.util.Scanner;

public class TestZaposleni {
    public static void main(String[] args) {
        Zaposleni jovan = new Zaposleni("Jovan", 3000, 2020, 11, 12); //jedan objekat tipa zaposleni
        Scanner scanner = new Scanner(System.in /*1 argument unutar konstruktura*/);
//        System.out.println(jovan.getIme());
//        System.out.println("Plata pre povisice: " + jovan.getPlata());
//        System.out.println(jovan.getDanZaposlenja());
//        jovan.setPlata(10);
//        System.out.println("Plata posle povisice: " + jovan.getPlata());
//        System.out.println(jovan.ime); ovo ne moze
//        System.out.println(jovan.plata); ovo ne moze
//        System.out.println(jovan.datumZapolenja); ovo ne moze

        Zaposleni[] zaposleni = new Zaposleni[3];

        zaposleni[0] = new Zaposleni("Marko", 1000, 2008, 3, 12);
        zaposleni[1] = new Zaposleni("Petar", 1000, 2012, 5, 1);
        zaposleni[2] = new Zaposleni("Marija", 1000, 2021, 9, 20);


        System.out.println("Pre povecanja plate: ");
        stampajZaposlene(zaposleni);


        for (Zaposleni radnik : zaposleni) {
            radnik.setPlata(5);
        }

        System.out.println("Posle povecanja plate:");
        stampajZaposlene(zaposleni);

        //TODO Za sve zaposlene koji su radili vise od 10 godina, povecaj platu za 20 %, pa istampaj da proveris
        for (Zaposleni radnik : zaposleni) {
            int godineIskustva = LocalDate.now().getYear() - radnik.getDanZaposlenja().getYear();
            if (godineIskustva >= 10) {
                radnik.setPlata(20);
            }
        }
    }

    public static void stampajZaposlene(Zaposleni[] zaposleni) {
        for (Zaposleni radnik : zaposleni) {
            System.out.println("id = " + radnik.getId() + ", " +
                    "ime = " + radnik.getIme() + ", " +
                    "plata = " + radnik.getPlata() + ", " +
                    "datum zaposlenja " + radnik.getDanZaposlenja());
        }

        Zaposleni.sayHello(); // zvanje staticke funkcije bez kreiranja objekta
    }
}
