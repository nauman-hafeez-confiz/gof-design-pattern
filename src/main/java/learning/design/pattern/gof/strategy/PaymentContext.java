package learning.design.pattern.gof.strategy;

public class PaymentContext {
    PaymentStrategy strategy;

    public void payment(String amount) {
        strategy.pay(amount);
    }
    public PaymentStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

}
