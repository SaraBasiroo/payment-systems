package payment;

public class CreditCardPayment implements PaymentStrategy {
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid By Credit card. The amount : " + amount + "$");
        System.out.println(getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Paid by Credit card, CC info : Card Number: " + cardNumber + "CC Holder's name : " + cardHolderName;
    }
}
