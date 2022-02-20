package Vladimir_Zurz_Bugaric;

public class Main {
    public static void main(String[] args) {
        PlaninarskiDom dom = new PlaninarskiDom("Dominator", 1955);
        Planina planina = new Planina("Kopaonik", "Srbija", 3000);
        Planina planina1 = new Planina("Tara", "Srbija", 9000);

        Planinar pl1 = new RekreativniPlaninar(1111,"Vladimir Zurz", 100, 10,"Kopaonik",3500 );
        Planinar pl2 = new RekreativniPlaninar(2222,"Majmun Idzuo", 90, 12,"Tara",2500);
        Planinar pl3 = new RekreativniPlaninar(3333,"James Huo", 85, 15,"Kopaonik",1400 );

        Planinar pl4 = new Alpinista(5555,"Kristina Kriss", 92,3);
        Planinar pl5 = new Alpinista(6666,"James Bond", 84,4);
        Planinar pl6 = new Alpinista(7777,"Romi Roman", 92,10);

        dom.uclaniPlaninara(pl1);
        dom.uclaniPlaninara(pl2);
        dom.uclaniPlaninara(pl3);
        dom.uclaniPlaninara(pl4);
        dom.uclaniPlaninara(pl5);
        dom.uclaniPlaninara(pl6);

        dom.izbaciPlaninaraizDoma(4444);
        dom.izbaciPlaninaraizDoma(3333);
        dom.stampaj();

        int mesecniPrihod = dom.vratiMesecniPrihod();

        int broj1 = dom.brojPlaninaraKojiceSePopeti(planina);
        int broj2 = dom.brojPlaninaraKojiceSePopeti(planina1);

        System.out.println("Na Kopaonik ce se uspesno popeti : " + broj1 + " planinara ");
        System.out.println("Na Taru ce se uspesno popeti : " + broj2 + " planinara ");
        System.out.println("Mesecni prihod planinarskog doma : " + mesecniPrihod);




    }
}
