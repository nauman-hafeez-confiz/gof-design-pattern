package learning.design.pattern.gof.proxy;

public class ProxyPatternApplication {

    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("proxyPattern.com");
            internet.connectTo("invalid.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
