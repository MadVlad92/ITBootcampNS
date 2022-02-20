package prodavnica;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Proizvod p1 = new Prehrambeni("475sdi7","mleko",100, LocalDate.of(2021,12,30));
        Proizvod p2 = new Tehnika("345kh3","sporet",35000,5,40);
        Proizvod p3 = new AlkoholnaPica("654k33","pivo",120,"staklena",10);
        Proizvod p4 = new Pice("774gg","sok breskva",200,"kartonska");

        Proizvod[] proizvodi= {p1,p2,p3,p4};


        System.out.println("Unesite ime i prezime: ");
        Scanner sc = new Scanner(System.in);
        String imeIprezime = sc.nextLine();
        Kupac kupac = new Kupac(imeIprezime.split(" ")[0],imeIprezime.split(" ")[1]);
        Korpa mojaKorpa = new Korpa(kupac);

        while (true){
            System.out.println("Unesit bar-kod proizvoda: ");
            String barKod = sc.next();

            if (barKod.equals("zavrsi")) break;

            System.out.println(barKod);

            boolean nadjen = false;
            for (Proizvod p:proizvodi) {
                if(p.getBarKod().equals(barKod)){
                    mojaKorpa.addProizvod(p);
                    System.out.println("Proizvod dodat!");
                    nadjen = true;
                }
            }
            if(!nadjen) System.out.println("Nema proizvoda sa unetim bar kodom");

        }

        mojaKorpa.ispisiRacun();

    }
}
