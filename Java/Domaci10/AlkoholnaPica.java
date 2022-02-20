package Domaci10;

public class AlkoholnaPica  extends Pice
{
    private double procenatAlkohola;

    public AlkoholnaPica(String barKod, String naziv, double cena, Ambalaza ambalaza, double procenatAlkohola)
    {
        super(barKod, naziv, cena, ambalaza);
        this.procenatAlkohola = procenatAlkohola;
    }

    public double getProcenatAlkohola() {
        return procenatAlkohola;
    }

    public void setProcenatAlkohola(double procenatAlkohola) {
        this.procenatAlkohola = procenatAlkohola;
    }
}
