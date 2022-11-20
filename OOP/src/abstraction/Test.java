package abstraction;

public class Test {

    public static void main(String[] args) {

        MobileUser mu; //refference variable

        mu = new Rahim();
        mu.call();
        mu.sendMessage();
        

        mu = new Karim();
        mu.sendMessage();


    }

}
