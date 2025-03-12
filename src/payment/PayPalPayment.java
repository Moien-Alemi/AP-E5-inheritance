package payment;

public class PayPalPayment implements PaymentStrategy{
    String email;

    public PayPalPayment(String email){
        this.email = email;
    }

    @Override
    public void pay(double amount){
        System.out.println("amount paid: " + amount);
        System.out.println(getPaymentDetails());
    }
    @Override
    public String getPaymentDetails(){
        String paymentDetails = "Payment Strategy : PayPal Payment\n" + "Email : " + email;
        return paymentDetails;
    }
}
