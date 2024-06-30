package S3_02N2_CallBack.Payment;

public class Paypal implements PaymentMethod {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }
    @Override
    public void pay(PaymentCallback callback) {
        System.out.println("Processing PayPal payment for email: " + email);
        callback.onPaymentSuccess("PayPal payment successful.");
    }
}
