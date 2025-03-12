import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer customer1 = new RegularCustomer("Ali");
        RegularCustomer customer2 = new RegularCustomer("Amir");
        PremiumCustomer customer3 = new PremiumCustomer("Moein");

        PaymentStrategy creditCard = new CreditCardPayment("062113692146", "Ali");
        PaymentStrategy paypal = new PayPalPayment("amir.ali@gmail.com");
        PaymentStrategy bitcoinWallet = new BitcoinPayment("sfsffjprgojofgrg322");

        customer1.displayCustomerInfo();
        System.out.println();
        customer2.displayCustomerInfo();
        System.out.println();
        customer3.displayCustomerInfo();
        System.out.println();

        customer1.makePayment(creditCard, 12.30);
        System.out.println();
        customer1.makePayment(paypal, 50.05);
        System.out.println();

        customer2.makePayment(paypal, 100);
        System.out.println();
        customer2.makePayment(bitcoinWallet, 234.5);
        System.out.println();

        customer3.makePayment(bitcoinWallet, 520);
        System.out.println();
        customer3.makePayment(creditCard, 20.46);
        System.out.println();

        customer1.showPaymentHistory();
        System.out.println();
        customer2.showPaymentHistory();
        System.out.println();
        customer3.showPaymentHistory();
    }
}