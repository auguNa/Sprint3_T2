package S3_02N2_CallBack.Store;

import S3_02N2_CallBack.Payment.PaymentCallback;
import S3_02N2_CallBack.Payment.PaymentGateway;
import S3_02N2_CallBack.Payment.PaymentMethod;

public class ShoeStore implements PaymentCallback {
    private PaymentGateway paymentGateway = new PaymentGateway();

    public void checkout(PaymentMethod paymentMethod) {
        paymentGateway.processPayment(paymentMethod, this);
    }
    @Override
    public void onPaymentSuccess(String message) {
        System.out.println("Payment succeeded: " + message);

    }

    @Override
    public void onPaymentFailure(String error) {
        System.out.println("Payment failed: " + error);

    }
}
