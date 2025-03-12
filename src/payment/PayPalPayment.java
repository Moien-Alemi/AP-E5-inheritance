package payment;

public class PayPalPayment {
    String email;

    public PayPalPayment(String email){
        this.email = email;
    }

    void pay(double amount){
        System.out.println("amount paid: " + amount);
        System.out.println(getPaymentDetails());
    }

    String getPaymentDetails(){
        String paymentDetails = "Payment Strategy : PayPal Payment\n" + "Email : " + email;
        return paymentDetails;
    }
}
