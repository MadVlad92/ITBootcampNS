package atleticari;

public class Trkac extends Atleticar {

    public Trkac(String ime, String prezime, int rezultat) {
        super(ime, prezime, rezultat);
    }


    @Override
    public int izracunajRezultat(Atleticar atleticar) {
        return 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
