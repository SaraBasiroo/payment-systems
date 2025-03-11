package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + ". The amount:" + amount + "$");
    }

    @Override
    public String getPaymentDetails() {
        return "Paid by BTC, From wallet : " + walletAddress;
    }
}
