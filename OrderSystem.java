import java.util.Scanner;

interface PaymentGateway{
    void processPayment(double amount);
}

interface Shipment{
    void shipOrder(String order_id);
}

abstract class Order{
    protected  String order_id;
    protected double amount;

    Order(String order_id,double amount){
        this.order_id = order_id;
        this.amount = amount;
    }

    abstract void generateInvoice();
}

//concrete class implementing both interfaces

class AmazonOrder extends Order implements PaymentGateway, Shipment{
    AmazonOrder(String order_id,double amount){
        super(order_id,amount);
    }
    public void processPayment(double amount){
        System.out.println("Amazon Payment processed Successfully: $"+amount);
    }
    @Override
    public void shipOrder(String order_id){
        System.out.println("Amazon Order "+order_id+" shipped successfully:");
    }
    void generateInvoice(){
        System.out.println("Amazon invoice generated :"+order_id);
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice;

        do{
            System.out.print("-----------Amazon Order System--------- \n");
            System.out.print("Enter Order ID: ");
            String order_id = sc.nextLine();

            System.out.print("Enter Order Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            AmazonOrder order = new AmazonOrder(order_id,amount);

            System.out.print("Processing Order");
            order.generateInvoice();
            order.processPayment(amount);
            order.shipOrder(order_id);

            System.out.println("Do you want to process another order(yes/no)");
            choice = sc.nextLine();

        }while(choice.equalsIgnoreCase("yes"));

        System.out.println("All orders processed successfully");
        sc.close();
    }
}
