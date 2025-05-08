package bites.examples;

public class Bagel {
    public static void main(String[] args){
        Bagel myBagel = new Bagel();
        myBagel.filling("chicken salad");
        myBagel.seed("poppy seeds");
        myBagel.price(5);
    }

    public void seed(String message) {
        System.out.println("It is topped with " + message + ".");
    }

    public void filling(String message) {
        System.out.println("This is a " + message + " bagel.");
    }

    public void price(Integer message) {
        System.out.println("It costs £" + message + ".");
    }
}
