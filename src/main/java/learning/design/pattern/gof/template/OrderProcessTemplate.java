package learning.design.pattern.gof.template;

public abstract class OrderProcessTemplate {
    public final void templateProcessOrder()
    {
        doSelect();
        doPayment();
        orderWrap();
        doDelivery();
    }
    public abstract void doDelivery();
    public abstract void doSelect();
    public abstract void doPayment();
    public void orderWrap()
    {
        try
        {
            System.out.println("Order wrap successful");
        }
        catch (Exception e)
        {
            System.out.println("Order wrap unsuccessful");
        }
    }

}
