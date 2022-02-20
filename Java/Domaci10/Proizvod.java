package Domaci10;

import java.util.Objects;

public abstract class Proizvod
{
    private String barKod;
    private String naziv;
    private double cena;

    public Proizvod(String barKod, String naziv, double cena) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setPopust(double popustPostotak)
    {
        cena *= (1 - popustPostotak / 100);
    }

    abstract void poruci(int kolicina);

    public String toString()
    {
        return naziv + " - " + cena;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Proizvod)) return false;
        Proizvod proizvod = (Proizvod) o;
        return Double.compare(proizvod.cena, cena) == 0 && barKod.equals(proizvod.barKod) && naziv.equals(proizvod.naziv);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(barKod, naziv, cena);
    }
}