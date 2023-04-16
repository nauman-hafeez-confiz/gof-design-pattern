package learning.design.pattern.gof.strategy;

public class PaymentByCardCredit implements PaymentStrategy {
    @Override
    public void pay(String amount) {
        System.out.println("Paid By credit card: " + amount);
    }
}
