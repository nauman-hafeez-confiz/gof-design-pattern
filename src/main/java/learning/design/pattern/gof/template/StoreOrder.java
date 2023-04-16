package learning.design.pattern.gof.template;

public class StoreOrder extends OrderProcessTemplate{
    @Override
    public void doSelect()
    {
        System.out.println("Customer chooses the item from store");
    }

    @Override
    public void doPayment()
    {
        System.out.println("Pays at counter through cash/POS");
    }

    @Override
    public void doDelivery()
    {
        System.out.println("Item delivered to in delivery counter");
    }
}