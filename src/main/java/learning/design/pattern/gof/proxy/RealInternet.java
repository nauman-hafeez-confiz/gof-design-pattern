package learning.design.pattern.gof.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost)
    {
        System.out.println("Connecting to "+ serverHost);
    }
}
