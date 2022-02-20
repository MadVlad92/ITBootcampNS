package Vladimir_Zurz_Bugaric;

public class Alpinista extends Planinar{
    private int ostvareniPoeni;


    public Alpinista(int indetifikacioniBroj, String imeIprezime, int brojPoena, int ostvareniPoeni) {
        super(indetifikacioniBroj, imeIprezime, brojPoena);
        this.ostvareniPoeni = ostvareniPoeni;
    }

    public int getOstvareniPoeni() {
        return ostvareniPoeni;
    }

    public void setOstvareniPoeni(int ostvareniPoeni) {
        this.ostvareniPoeni = ostvareniPoeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista : " + this.getIndetifikacioniBroj());
        System.out.println("Ime: " + this.getImeIprezime());
        System.out.println("Broj poena: " + this.getOstvareniPoeni());

    }

    @Override
    public int vratiClanarinuPlaninara() {
        return 1500 - (this.ostvareniPoeni * 50);
    }

    @Override
    public String toString() {
        return "Alpinista{" +
                "ostvareniPoeni=" + ostvareniPoeni +
                "} " + super.toString();
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine() <= 4000) {
            return true;
        } else {
            return false;

        }


    }
}


