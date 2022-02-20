package atleticari;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Atleticar> ateleticari = new ArrayList<>();
        Atleticar[] takmaci = new Atleticar[] {
                new Skakac("Marko", "S", 3),
                new Skakac("Stefan", "S", 2),
                new Skakac("Dusan", "S", 5)
        };

        ateleticari.add(new Skakac("Marko", "S", 3));
        ateleticari.add(new Skakac("Stefan", "S", 2));
        ateleticari.add(new Skakac("Dusan", "S", 5));
        ateleticari.add(new Skakac("Mirko", "S", 10));

        Disciplina skokUdalj = new Disciplina("Skok u dalj", "skakacka", ateleticari);
        System.out.println(skokUdalj.stampajPobednika());

        ArrayList<Atleticar> trkaci = new ArrayList<>();
        trkaci.add(new Trkac("Jovan", "M", 20));
        trkaci.add(new Trkac("Stefan", "M", 10));
        trkaci.add(new Trkac("Dragan", "M", 5));

        Disciplina prepone100m = new Disciplina("100 m s preponama", "trkacka", trkaci);
        System.out.println(prepone100m.stampajPobednika());

        Arrays.sort(takmaci, (x, y) -> x.compare(x, y));
        System.out.println(Arrays.toString(takmaci));

    }
}
