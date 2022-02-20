package prodavnica;
public abstract class Proizvod {
    private String barKod ;
    private String naziv;
    private double cena;

    public Proizvod() {

    }

    public Proizvod(String barKod, String naziv, double cena) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getBarKod() {
        return barKod;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
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

    public void setPopust(double popust){
        this.cena -=  ((popust/100.0) * this.cena);
    }

    public abstract void poruci(int kolicina);

    @Override
    public String toString() {
        return "Proizvod{" +
                "barKod='" + barKod + '\'' +
                ", naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}';
    }
}
