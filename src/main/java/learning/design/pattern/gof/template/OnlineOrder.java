package learning.design.pattern.gof.template;

public class OnlineOrder extends OrderProcessTemplate{
    @Override
    public void doSelect()
    {
        System.out.println("Item added to online shopping cart");
    }

    @Override
    public void doPayment()
    {
        System.out.println("Online Payment through online banking");
    }

    @Override
    public void doDelivery()
    {
        System.out.println("Ship the item through post to delivery address");
    }
}
