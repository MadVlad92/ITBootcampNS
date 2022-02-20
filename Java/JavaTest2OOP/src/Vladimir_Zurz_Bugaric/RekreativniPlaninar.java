package Vladimir_Zurz_Bugaric;

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maxUspon;

    public RekreativniPlaninar(int indetifikacioniBroj, String imeIprezime, int brojPoena, int tezinaOpreme, String nazivOkruga, int maxUspon) {
        super(indetifikacioniBroj, imeIprezime, brojPoena);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    @Override
    public void stampaj() {



    }

    @Override
    public int vratiClanarinuPlaninara() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if((this.maxUspon - (this.tezinaOpreme * 50)) < planina.getVisinaPlanine()) {
            return true;
        } else {
            return false;
        }

    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    @Override
    public String toString() {
        return "RekreativniPlaninar{" +
                "tezinaOpreme=" + tezinaOpreme +
                ", nazivOkruga='" + nazivOkruga + '\'' +
                ", maxUspon=" + maxUspon +
                "} " + super.toString();
    }
}
