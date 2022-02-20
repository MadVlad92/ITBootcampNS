package Vladimir_Zurz_Bugaric;

public class Planina {
    private String imePlanine;
    private String nazivDrzaveuKojojSeNalazi;
    private int visinaPlanine;


    public Planina(String imePlanine, String nazivDrzaveuKojojSeNalazi, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.nazivDrzaveuKojojSeNalazi = nazivDrzaveuKojojSeNalazi;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getNazivDrzaveuKojojSeNalazi() {
        return nazivDrzaveuKojojSeNalazi;
    }

    public void setNazivDrzaveuKojojSeNalazi(String nazivDrzaveuKojojSeNalazi) {
        this.nazivDrzaveuKojojSeNalazi = nazivDrzaveuKojojSeNalazi;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

}
