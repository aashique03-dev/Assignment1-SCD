package amazon;

import interfaces.CloudHostingProvider;
import interfaces.CDNProvider;
import interfaces.CloudStorageProvider;

public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {

    @Override
    public void createServer(String region) {
        System.out.println("Amazon: creating server in " + region);
    }

    @Override
    public void listServers(String region) {
        System.out.println("Amazon: listing servers in " + region);
    }

    @Override
    public void getCDNAddress() {
        System.out.println("Amazon: getting CDN address");
    }

    @Override
    public void storeFile(String name) {
        System.out.println("Amazon: storing file " + name);
    }

    @Override
    public void getFile(String name) {
        System.out.println("Amazon: getting file " + name);
    }
}
