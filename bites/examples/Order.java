package bites.examples;

public class Order {

    Double total = 0.00;

    public void addAmount(Double amount) {
        this.total = total + amount;
    }

    public void addDiscount(Double discount) {
        this.total = total - discount;
    }

    public Double getTotal() {
        return this.total;
    }

    public String friendlyTotal() {
        return String.format("Thanks! The total value of your order is %.2f ", total);
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addAmount(20.00);
        order.addDiscount(10.00);
        Double total = order.getTotal();
        System.out.println(total);
        String totalMessage = order.friendlyTotal();
        System.out.println(totalMessage);
    }
}
