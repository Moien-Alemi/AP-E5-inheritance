package payment;

public class BitcoinPayment implements PaymentStrategy {
    String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount){
        System.out.println("amount paid: " + amount);
        System.out.println(getPaymentDetails());
    }
    @Override
    public String getPaymentDetails(){
        String paymentDetails = "Payment Strategy : Bitcoin Payment\n" + "wallet address : " + walletAddress;
        return paymentDetails;
    }
}
