import payment.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Customer Ali = new PremiumCustomer("Ali");
        Customer Reza = new RegularCustomer("Reza");
        Customer Amir = new PremiumCustomer("Amir");

        PaymentStrategy cc = new CreditCardPayment("6219861941347677", "Ali");
        PaymentStrategy btc = new BitcoinPayment("wdghsvday3747162387wg:gdd932");
        PaymentStrategy PayPal = new PayPalPayment("Sarabasiroo@yahoo.com");

        Ali.displayCustomerInfo();
        Reza.displayCustomerInfo();
        Amir.displayCustomerInfo();
        System.out.println("-----------------------------------------------");

        Ali.makePayment(cc , 45.00);
        Ali.makePayment(btc , 2330.99);
        System.out.println("-----------------------------------------------");

        Reza.makePayment(PayPal , 213.55);
        Reza.makePayment(btc , 78.99);
        System.out.println("-----------------------------------------------");

        Amir.makePayment(cc , 799.99);
        Amir.makePayment(PayPal , 780);
        System.out.println("***********************************************");

        Ali.showPaymentHistory();
        System.out.println("-----------------------------------------------");
        Reza.showPaymentHistory();
        System.out.println("-----------------------------------------------");
        Amir.showPaymentHistory();
        System.out.println("***********************************************");

    }
}