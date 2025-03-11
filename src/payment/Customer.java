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

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails() + ", Amount : " + amount);
    }
    public void showPaymentHistory() {
        System.out.println("Payment history of " + name + " : ");
        paymentHistory.forEach(paymentHistory -> System.out.println(String.join(", ", paymentHistory)));
    }
}
