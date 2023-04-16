package learning.design.pattern.gof.facade;

public class BillingSystem {
    public Bill createBill(int amount) {
        return new Bill(amount);
    }
}
