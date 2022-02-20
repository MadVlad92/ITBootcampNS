

public class Main {
    public static void main(String[] args) {
        fizbuzz(110);
    }
    public  static  void fizbuzz(int n){
        for (int i = 0 ; i <= n; i++){
            String ispis = "";

            if(i % 3 == 0) ispis+= "fizz"; // ispis = ispis + "fizz"    "" + "fizz"  + "buzz" + "zaaz" = "fizzzbuzzzazz"
            if(i % 5 == 0) ispis+= "buzz";
            if(i % 7 == 0) ispis+= "zazz";

            if(ispis.equals("")){
                System.out.println(i);
            }else {
                System.out.println(ispis);
            }
        }
    }
}


