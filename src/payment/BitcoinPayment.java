package payment;

public class BitcoinPayment {
    String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }

    void pay(double amount){
        System.out.println("amount paid: " + amount);
        System.out.println(getPaymentDetails());
    }

    String getPaymentDetails(){
        String paymentDetails = "Payment Strategy : Bitcoin Payment\n" + "wallet address : " + walletAddress;
        return paymentDetails;
    }
}
