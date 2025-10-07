import java.util.Scanner;

class Payment{
    public void process(double amount){
        System.out.println("Generic Payment processed"+amount);
    }
}
class CreditCard extends Payment{
    public void process(double amount){
        System.out.println("Credit Card processed"+amount);
    }
}
class UPI extends Payment{
    public void process(double amount){
        System.out.println("UPI Payment processed"+amount);
    }
}
class Crypto extends Payment{
    public void process(double amount){
        System.out.println("CryptoPayment processed"+amount);
    }
}

public class PaymentProcessor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to Payment Processor System");
        do{
            System.out.print("Enter payment type(creditcard/upi/crypto): ");
            String type = sc.nextLine();

            System.out.print("Enter amount to be paid: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            Payment payment;

            if (type.equalsIgnoreCase("CreditCard")){
                payment=new CreditCard();
            }else if (type.equalsIgnoreCase("UPI")){
                payment=new UPI();
            }else if (type.equalsIgnoreCase("Crypto")){
                payment=new Crypto();
            }else{
                System.out.println("Invalid Payment. Defaulting to generic payment method");
                payment=new Payment();
            }
            payment.process(amount);

            System.out.println("Do you want to process another payment(yes/no)");
            choice=sc.nextLine();
        }while(choice.equalsIgnoreCase("yes"));
        System.out.println("Thankyou, All payments process successfull");
        sc.close();
    }
}
