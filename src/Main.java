import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer customer1 = new RegularCustomer("Ali");
        RegularCustomer customer2 = new RegularCustomer("Amir");
        PremiumCustomer customer3 = new PremiumCustomer("Moein");

        PaymentStrategy creditCard = new CreditCardPayment("062113692146", "Ali");
        PaymentStrategy Paypal = new PayPalPayment("amir.ali@gmail.com");
        PaymentStrategy BitcoinWallet = new BitcoinPayment("sfsffjprgojofgrg322");


    }
}