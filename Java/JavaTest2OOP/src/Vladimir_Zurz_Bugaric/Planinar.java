package Vladimir_Zurz_Bugaric;

public abstract class Planinar {
    private int indetifikacioniBroj;
    private String imeIprezime;
    private int brojPoena;

    public Planinar(int indetifikacioniBroj, String imeIprezime, int brojPoena) {

        this.indetifikacioniBroj = indetifikacioniBroj;
        this.imeIprezime = imeIprezime;
        this.brojPoena = brojPoena;
    }


    public int getIndetifikacioniBroj() {
        return indetifikacioniBroj;

    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public abstract void stampaj();

    public abstract int vratiClanarinuPlaninara();

    public abstract boolean uspesanUspon(Planina planina);


}







