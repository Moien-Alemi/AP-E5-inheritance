package payment;

public class CreditCardPayment {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    void pay(double amount){
        System.out.println("amount paid: " + amount);
        System.out.println(getPaymentDetails());
    }

    String getPaymentDetails(){
        String paymentDetails = "Payment Strategy : CreditCard Payment\n" + "card number : " + cardNumber + "\ncardholder Name : " + cardHolderName;
        return paymentDetails;
    }
}
