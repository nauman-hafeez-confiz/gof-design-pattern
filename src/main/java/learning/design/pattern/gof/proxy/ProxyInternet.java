package learning.design.pattern.gof.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("invalid.com");
        bannedSites.add("denied.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception
    {
        if(bannedSites.contains(serverHost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }
}
