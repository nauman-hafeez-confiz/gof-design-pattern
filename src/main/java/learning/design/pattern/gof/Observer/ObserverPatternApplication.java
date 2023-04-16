package learning.design.pattern.gof.Observer;

public class ObserverPatternApplication {
    public static void main(String[] args)
    {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();

        MessagePublisher p = new MessagePublisher();
        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update
        p.notifyUpdate(new Message("Second Message"));
    }
}
