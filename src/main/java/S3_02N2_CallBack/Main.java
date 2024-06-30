package S3_02N2_CallBack;

import S3_02N2_CallBack.Payment.BankAccount;
import S3_02N2_CallBack.Payment.CreditCard;
import S3_02N2_CallBack.Payment.PaymentMethod;
import S3_02N2_CallBack.Payment.Paypal;
import S3_02N2_CallBack.Store.ShoeStore;

public class Main {
    public static void main(String[] args) {
        ShoeStore store = new ShoeStore();

        PaymentMethod creditCard = new CreditCard("1234-5678-9012-3456");
        PaymentMethod paypal = new Paypal("user@example.com");
        PaymentMethod bankAccount = new BankAccount("9876543210");

        System.out.println("Checking out with Credit Card:");
        store.checkout(creditCard);

        System.out.println("\nChecking out with PayPal:");
        store.checkout(paypal);

        System.out.println("\nChecking out with Bank Account:");
        store.checkout(bankAccount);
    }
}
