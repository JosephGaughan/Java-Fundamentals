package bites.examples;

public class Discounter {

    Integer discount = 20;

    public Integer applyTo(Integer total) {
        return total - discount;
    }

    public static void main(String[] args) {
        Integer total = 100;
        Discounter discounter = new Discounter();
        total = discounter.applyTo(total);
        System.out.println(total);
    }
}
