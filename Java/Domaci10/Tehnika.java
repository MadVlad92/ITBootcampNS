package Domaci10;

import java.util.Date;

public class Tehnika extends Proizvod
{
    private int garancija;
    private double tezina;

    public Tehnika(String barKod, String naziv, double cena, int garancija, double tezina)
    {
        super(barKod, naziv, cena);
        this.garancija = garancija;
        this.tezina = tezina;
    }

    public int getGarancija() {
        return garancija;
    }

    public void setGarancija(int garancija) {
        this.garancija = garancija;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    @Override
    void poruci(int kolicina)
    {
        if(tezina * kolicina > 30)
        {
            System.out.println("Dostava do vrate");
        }
        System.out.println("Vas racun je: " + kolicina * getCena());
    }
}