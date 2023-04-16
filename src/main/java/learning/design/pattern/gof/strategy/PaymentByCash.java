package learning.design.pattern.gof.strategy;

public class PaymentByCash implements PaymentStrategy {
    @Override
    public void pay(String amount) {
        System.out.println("Paid by cash: " + amount);
    }
}
