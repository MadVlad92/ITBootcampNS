package prodavnica;

public class Pice extends Proizvod {
    private String ambalaza;

    public Pice(String barKod, String naziv, double cena, String ambalaza) {
        super(barKod, naziv, cena);
        this.ambalaza = ambalaza;
    }

    public String getAmbalaza() {
        return ambalaza;
    }

    public void setAmbalaza(String ambalaza) {
        this.ambalaza = ambalaza;
    }

    public double cenaAmbalaze(){
        switch (this.ambalaza){
            case "kartonska" :  return this.getCena() * 0.1;
            case "plasticna" : return this.getCena() * 0.2;
            case "staklena" : ;
            case "limenka" : return  this.getCena() * 0.3;
        }
        return 1;
    }

    @Override
    public void poruci(int kolicina) {
        System.out.println("Vas racun je : " +( this.getCena() + this.cenaAmbalaze() )* kolicina);
    }
}