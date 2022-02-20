package prodavnica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Korpa {
    private Kupac kupac;
//    private ArrayList<Proizvod> proizvodi;
//    private ArrayList<Integer> kolicine;
     HashMap<Proizvod,Integer> proizvodiKolicine ;

    public Korpa(Kupac kupac) {
        this.kupac = kupac;
//        this.proizvodi = new ArrayList<>();
//        this.kolicine = new ArrayList<>();
            this.proizvodiKolicine = new HashMap<>();
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }


    public  void addProizvod(Proizvod proizvod){
        if(!this.proizvodiKolicine.containsKey(proizvod)){
            this.proizvodiKolicine.put(proizvod,1);
        }else {
            int staraKolicina = this.proizvodiKolicine.get(proizvod);
            this.proizvodiKolicine.replace(proizvod,staraKolicina + 1);
        }
    }


//    public void addProizvod(Proizvod proizvod){
//        if(!this.proizvodi.contains(proizvod)){
//            this.proizvodi.add(proizvod);
//            this.kolicine.add(1);
//        }else{
//            int indexOfProduct = this.proizvodi.indexOf(proizvod);
//            int newValue = this.kolicine.get(indexOfProduct) + 1;
//            this.kolicine.set(indexOfProduct,newValue);
//        }
//    }

//    public void ispisiRacun(){
//        int ukupno = 0;
//        for (int i = 0 ; i < this.proizvodi.size(); i++){
//            System.out.println(this.proizvodi.get(i).getNaziv() + "  x" +   this.kolicine.get(i) + "  " + this.kolicine.get(i) * this.proizvodi.get(i).getCena());
//          //  this.proizvodi.get(i).poruci(this.kolicine.get(i));
//            ukupno +=  this.kolicine.get(i) * this.proizvodi.get(i).getCena();
//        }
//        System.out.println("Za uplatu: " + ukupno);
//    }

    public void ispisiRacun(){
        System.out.println(this.proizvodiKolicine);
    }



}
