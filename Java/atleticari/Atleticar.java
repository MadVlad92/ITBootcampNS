package atleticari;

import java.util.Comparator;

public abstract class Atleticar implements Comparator {
    private String ime, prezime;
    private int rezultat;

    public Atleticar(String ime, String prezime, int rezultat) {
        this.ime = ime;
        this.prezime = prezime;
        this.rezultat = rezultat;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getRezultat() {
        return rezultat;
    }

    @Override
    public int compare(Object a1, Object a2) {
        Atleticar atleticar1 = (Atleticar) a1;
        Atleticar atleticar2 = (Atleticar) a2;
        return  atleticar2.getRezultat() - atleticar1.getRezultat();
    }

    public abstract int izracunajRezultat(Atleticar atleticar);

    @Override
    public String toString() {
        return "Atleticar{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", rezultat=" + rezultat +
                '}';
    }
}
