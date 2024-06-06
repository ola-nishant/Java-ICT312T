abstract class Payment {
    abstract void makePayment();

    void paymentDetails() {
        System.out.println("Payment details are being processed.");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }
}

class PayPalPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using PayPal.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.makePayment();       // Outputs: Payment made using Credit Card.
        payment1.paymentDetails();    // Outputs: Payment details are being processed.

        Payment payment2 = new PayPalPayment();
        payment2.makePayment();       // Outputs: Payment made using PayPal.
        payment2.paymentDetails();    // Outputs: Payment details are being processed.
    }
}
