package Domaci10;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;

public class Korpa
{
    private Kupac kupac;
    private HashMap<Proizvod,Integer> proizvodi;

    public Korpa(Kupac kupac)
    {
        proizvodi = new HashMap<>();
        this.kupac = kupac;
    }

    public Kupac getKupac()
    {
        return kupac;
    }

    public void setKupac(Kupac kupac)
    {
        this.kupac = kupac;
    }

    public HashMap<Proizvod, Integer> getProizvodi()
    {
        return proizvodi;
    }

    public void addProizvod(Proizvod proizvod)
    {
        proizvodi.put(proizvod, proizvodi.getOrDefault(proizvod, 1) + 1);
    }

    public void ispisiRacun()
    {
        System.out.println(" Naziv   |   Kolicina    |   Cena");
        System.out.println("----------------------------------");

        for (Proizvod p: proizvodi.keySet())
        {
            String s = " ";

            s+= p.getNaziv() + "       " + proizvodi.get(p) + "       "  + p.getCena() * proizvodi.get(p);
            System.out.println(s);
        }
    }
}