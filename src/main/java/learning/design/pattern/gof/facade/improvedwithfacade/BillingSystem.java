package learning.design.pattern.gof.facade.improvedwithfacade;

public class BillingSystem {
    public Bill createBill(int amount) {
        return new Bill(amount);
    }
}
