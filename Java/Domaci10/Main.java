package Domaci10;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Kupovina(kreirajKorpu(), kreirajProizvode());
    }

    private static Korpa kreirajKorpu()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi ime korisnika: ");
        String ime = scanner.next();
        System.out.println();

        System.out.print("Unesi prezime korisnika: ");
        String prezime = scanner.next();
        System.out.println();

        return new Korpa(new Kupac(ime,prezime));
    }

    private static LinkedList<Proizvod> kreirajProizvode()
    {
        Proizvod p1 = new Prehrambeni("1","mleko",100, LocalDate.of(2021,12,30));
        Proizvod p2 = new Tehnika("2","sporet",35000, 5, 40);
        Proizvod p3 = new AlkoholnaPica("3","pivo",120, Pice.Ambalaza.STAKLENA, 10);
        Proizvod p4 = new Pice("4","sok",200, Pice.Ambalaza.KARTONSKA);

        LinkedList<Proizvod> proizvodi = new LinkedList<>();
        proizvodi.add(p1);
        proizvodi.add(p2);
        proizvodi.add(p3);
        proizvodi.add(p4);

        return proizvodi;
    }

    private static void Kupovina(Korpa korpa, List<Proizvod> proizvodi)
    {
        Scanner scanner = new Scanner(System.in);
        String unos = "";

        while (!unos.equals("zavrsiKupovinu"))
        {
            System.out.print("Unesite barkodProizvoda: ");
            unos = scanner.next();
            System.out.println();

            Boolean pExist = false;

            for (Proizvod p: proizvodi)
            {
                if(p.getBarKod().equals(unos))
                {
                    korpa.addProizvod(p);
                    pExist = true;
                    break;
                }
            }
            if(pExist == true)
            {
                System.out.println("Proizvod dodan u korpu");
            }
            else
            {
                System.out.println("Proizvod ne postoji");

            }
        }
        korpa.ispisiRacun();
    }
}