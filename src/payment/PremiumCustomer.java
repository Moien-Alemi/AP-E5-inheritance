package payment;

public class PremiumCustomer extends Customer{

    public PremiumCustomer(String name){
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer's name : " + name);
        System.out.println("this customer is a Premium customer.");
    }
}
