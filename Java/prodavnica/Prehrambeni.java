package prodavnica;
import java.time.LocalDate;

public class Prehrambeni extends Proizvod{

    private LocalDate datumIsteka;

    public Prehrambeni(String barKod, String naziv, double cena,LocalDate datumIsteka) {
        super(barKod, naziv, cena);
        this.datumIsteka = datumIsteka;
    }


    public LocalDate getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(LocalDate datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    @Override
    public void poruci(int kolicina) {
        if(LocalDate.now().compareTo(this.datumIsteka) > 0)
        System.out.println("Vas racun je : " + this.getCena() * kolicina);
        else
        System.out.println("Datum istekao !!!");
    }
}
