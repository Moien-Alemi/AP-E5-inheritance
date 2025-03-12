package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name){
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount){
        paymentStrategy.pay(amount);
        String paymentDetails = "amount paid: " + amount + "\n" + paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentDetails);
    }

    public void showPaymentHistory(){
        for(String payment : paymentHistory){
            System.out.println(payment);
        }
    }
}
