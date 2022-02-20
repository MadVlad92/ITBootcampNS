package Domaci10;

public class Pice extends Proizvod
{
    @Override
    public void poruci(int kolicina)
    {
        int taksaNaAmbalazu = 0;

        switch (ambalaza)
        {
            case LIMENA:  taksaNaAmbalazu = 30;
                break;
            case STAKLENA : taksaNaAmbalazu = 30;
                break;
            case KARTONSKA : taksaNaAmbalazu = 10;
                break;
            case PLASTICNA : taksaNaAmbalazu = 20;
                break;
        }

        System.out.println("Vas racun je: " + kolicina * getCena() * (1+taksaNaAmbalazu/100));
    }

    public enum Ambalaza
    {
        KARTONSKA,
        PLASTICNA,
        STAKLENA,
        LIMENA
    }

    private Ambalaza ambalaza;

    public Pice(String barKod, String naziv, double cena, Ambalaza ambalaza) {
        super(barKod, naziv, cena);
        this.ambalaza = ambalaza;
    }

    public Ambalaza getAmbalaza()
    {
        return ambalaza;
    }

    public void setAmbalaza(Ambalaza ambalaza)
    {
        this.ambalaza = ambalaza;
    }
}