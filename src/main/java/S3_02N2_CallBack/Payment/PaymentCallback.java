package S3_02N2_CallBack.Payment;

public interface PaymentCallback {
    void onPaymentSuccess(String message);
    void onPaymentFailure(String error);
}
