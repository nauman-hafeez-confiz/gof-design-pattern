package learning.design.pattern.gof.strategy;

public class PaymentByDebitCard implements PaymentStrategy{
    @Override
    public void pay(String amount) {
        System.out.println("Paid by card: " + amount);
    }
}
