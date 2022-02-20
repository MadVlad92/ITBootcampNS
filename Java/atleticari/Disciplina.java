package atleticari;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
    private String ime, tipDiscipline;
    private ArrayList<Atleticar> ucesnici;
    private Atleticar[] takmaci; // moze i ovako


    public Disciplina(String ime, String tipDiscipline, ArrayList<Atleticar> ucesnici) {
        this.ime = ime;
        this.tipDiscipline = tipDiscipline;
        this.ucesnici = ucesnici;
    }

    public Disciplina(String ime, String tipDiscipline, Atleticar[] takmaci) {
        this.ime = ime;
        this.tipDiscipline = tipDiscipline;
        this.takmaci = takmaci;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public ArrayList<Atleticar> getUcesnici() {
        return ucesnici;
    }

    public void dodajAtleticara(Atleticar atleticar) {
        this.ucesnici.add(atleticar);
    }

    public void diskvalifikuj(Atleticar a) {
        this.ucesnici.remove(a);
    }

    private Atleticar pobednik() {
        int max = 0;
        Atleticar pobednik = null;
        for (Atleticar a : this.ucesnici) {
            if (a.getRezultat() > max) {
                max = a.getRezultat();
                pobednik = a;
            }
        }
        
        return pobednik;
    }


    public String stampajPobednika() {
        return pobednik().toString();
    }

}
