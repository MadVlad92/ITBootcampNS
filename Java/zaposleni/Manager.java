package zaposleni;

public class Manager extends Zaposleni {

    private double bonus;

    public Manager(String local_ime, double plata, int god, int mesec, int dan) {
        super(local_ime, plata, god, mesec, dan);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getPlata() {
        return bonus + super.getPlata();
    }

    @Override
    public String toString() {
        return super.toString() + "\n bonus="  + this.bonus;
    }

    public static void main(String[] args) {
        Manager manager1 = new Manager("Zarko", 10000, 1991, 2, 3);
        System.out.println(manager1 instanceof Manager); // true
        System.out.println(manager1 instanceof Zaposleni); // true

        Zaposleni radnik1 = new Zaposleni("Milam", 10000, 1991, 2, 3);
        System.out.println(radnik1 instanceof Manager); // false


        manager1.setBonus(100.00);
        System.out.println(manager1.getBonus());

        System.out.println(manager1.getIme()); // manager nasledjuje od superklase zaposleni


        // Polimorfizam
        Manager manager = new Manager("Petar", 1000, 2012, 5, 1);
        manager.setBonus(200);

        Zaposleni[] zaposleni = new Zaposleni[3];

        zaposleni[0] = new Zaposleni("Marko", 1000, 2008, 3, 12);
        zaposleni[1] = manager;
        zaposleni[2] = new Zaposleni("Marija", 1000, 2021, 9, 20);

        for (Zaposleni radnik : zaposleni) {
            System.out.println(radnik.getPlata()); //polymorphism, dynamic runtime variable binding
        }

        // zaposleni[1].setBonus(1000); // -> compajler registruje zaposlenog na [1] kao zaposlenog




    }


}
