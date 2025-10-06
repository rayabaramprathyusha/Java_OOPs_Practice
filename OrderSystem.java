interface PaymentGateway {
    void processPayment(double amount);
}

interface Shipment {
    void shipOrder(String orderId);
}

abstract class Order {
    protected String orderId;
    protected double amount;

    Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    abstract void generateInvoice();
}

class AmazonOrder extends Order implements PaymentGateway, Shipment {
    AmazonOrder(String orderId, double amount) {
        super(orderId, amount);
    }

    public void processPayment(double amount) {
        System.out.println("Amazon Payment processed for $" + amount);
    }

    public void shipOrder(String orderId) {
        System.out.println("Order " + orderId + " shipped via Amazon logistics.");
    }

    void generateInvoice() {
        System.out.println("Amazon Invoice generated for Order ID: " + orderId);
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        AmazonOrder order = new AmazonOrder("ORD12345", 249.99);
        order.generateInvoice();
        order.processPayment(order.amount);
        order.shipOrder(order.orderId);
    }
}
