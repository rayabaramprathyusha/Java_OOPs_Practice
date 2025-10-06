class Payment {
    public void process(double amount) {
        System.out.println("Generic payment processed: $" + amount);
    }
}

class CreditCard extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Credit card payment processed: $" + amount);
    }
}

class UPI extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("UPI payment processed successfully.");
    }
}

class Crypto extends Payment {
    @Override
    public void process(double amount) {
        System.out.println("Crypto payment confirmed on blockchain.");
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        Payment[] payments = { new CreditCard(), new UPI(), new Crypto() };
        for (Payment p : payments) {
            p.process(1500);
        }
    }
}
