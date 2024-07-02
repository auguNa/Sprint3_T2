package S3_02N2_CallBack.Payment;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, PaymentCallback callback) {
        paymentMethod.pay(callback);
    }
}
