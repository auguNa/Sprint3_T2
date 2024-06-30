package S3_02N2_CallBack.Payment;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, PaymentCallback callback) {
        // The payment method will process the payment and call the callback
        paymentMethod.pay(callback);
    }
}
