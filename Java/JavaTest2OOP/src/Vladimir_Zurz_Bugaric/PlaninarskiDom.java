package Vladimir_Zurz_Bugaric;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;

    ArrayList<Planinar> planinari = new ArrayList<Planinar>();


    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        super();
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;

    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }

    public void uclaniPlaninara(Planinar planinar) {
        planinari.add(planinar);

    }

    public void izbaciPlaninaraizDoma(int indetifikacioniBr) {
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).getIndetifikacioniBroj() == indetifikacioniBr) {
                planinari.remove(i);
            }
        }
    }

    public int brojPlaninaraKojiceSePopeti(Planina planina) {
        int count = 0;
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).uspesanUspon(planina)) {
                count++;
            }

            }

        return count;
    }

    public void stampaj() {
        System.out.println("Naziv doma: " + this.nazivDoma);
        System.out.println("Godina osnovanja doma: " + this.godinaOsnivanja);

        for (int i = 0; i < planinari.size(); i++) {
            System.out.println("IBroj : " + planinari.get(i).getIndetifikacioniBroj());
            System.out.println("Ime i prezime : " + planinari.get(i).getImeIprezime());
            System.out.println("Clanarina: " + planinari.get(i).vratiClanarinuPlaninara());
        }
    }

    public int vratiMesecniPrihod() {
        int prihod = 0;
        for (int i = 0; i < planinari.size(); i++) {
            prihod = prihod + planinari.get(i).vratiClanarinuPlaninara();
        }
        return prihod;
    }



}