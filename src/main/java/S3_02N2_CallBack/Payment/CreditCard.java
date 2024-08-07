package S3_02N2_CallBack.Payment;

public class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(PaymentCallback callback) {

        System.out.println("Processing credit card payment with card number: " + cardNumber);
        callback.onPaymentSuccess("Credit Card payment successful.");
    }
}
