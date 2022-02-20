package zaposleni;

import java.time.LocalDate;
import java.util.Date;

public class Zaposleni {
    // privatna polja (instance fields)
    private String ime; // enkapsulatcija
    private double plata;
    private LocalDate danZaposlenja;

    private Date dan; // primer sa 'mutable' objects poljima

    private static int nextId = 0; //staticka polja se kreiraju samo jednom za celu klasu objekata
    private int id = setId();

    public static final String hello = "Zdravo!"; //staticke konstante imaju 'final' kao prefix

    //private, public = modifikatori pristupa
    public Zaposleni(String local_ime, double plata, int god, int mesec, int dan) { // konstruktor mora imati isto ime kao ime klase
        ime = local_ime;
        this.plata = plata;
        this.danZaposlenja = LocalDate.of(god, mesec, dan);
    }

    // konstruktor sa lokalnim datumom sada
    public Zaposleni(String ime, double plata) {
        this.ime = ime;
        this.plata = plata;
        this.danZaposlenja = LocalDate.now();
    }

    public Zaposleni(String ime) {
        //int s = 2; ovo ne moze
        this(ime, 400); // zovemo vec postojeci konstruktor i prosledjujemo platu
        System.out.println("OVO MOZE....");
    }

    //parameterless constructor
    public Zaposleni() {
        this.ime = "changeme";
        this.plata = 0;
        this.danZaposlenja = LocalDate.now();
    }

    public String getIme() { //getter
        return ime;
    }

    public double getPlata() {
        return plata;
    }

    public LocalDate getDanZaposlenja() {
        return danZaposlenja;
    }

    public void setPlata(double procenat) { //setter
        double povisica = this.plata * procenat / 100;
        this.plata = this.plata + povisica; // ova linija 'SETUJE' privatnu instancu promenljive 'plata'
    }

    public Date getDan() {
        return (Date) this.dan.clone(); // osiguramo da vracamo kopiju originalnog objekta
    }

    public int setId() {
        id = nextId;
        nextId++;
        return id;
    }

    public int getId() {
        return id;
    }

    public static void sayHello() {
        System.out.println(hello); // mozemo referirati na staticke promenljive
//        System.out.println(this.id); ne mozemo referirati na private polja
    }

    public String helloName() {
        sayHello(); // mozemo referirati na staticke metode unutar ne statickih metoda
        return hello + this.ime; // mozemo referirati na staticke promenljvie unutar ne statickih metoda
    }

    @Override
    public String toString() {
        return "zaposleni.Zaposleni{" +
                "ime='" + ime + '\'' +
                ", plata=" + plata +
                ", danZaposlenja=" + danZaposlenja +
                ", dan=" + dan +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Object objekat = new Object();
        Object myObj = new Zaposleni();
        System.out.println(myObj);
    }
}
