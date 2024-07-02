package S3_02N2_CallBack.Payment;

public class BankAccount implements PaymentMethod {
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(PaymentCallback callback) {
        System.out.println("Processing bank account payment with account number: " + accountNumber);
        callback.onPaymentSuccess("Bank Account payment successful.");
    }
}


