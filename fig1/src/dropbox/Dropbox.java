package dropbox;

import interfaces.CloudStorageProvider;

public class Dropbox implements CloudStorageProvider {

    @Override
    public void storeFile(String name) {
        System.out.println("Dropbox: storing file " + name);
    }

    @Override
    public void getFile(String name) {
        System.out.println("Dropbox: getting file " + name);
    }
}
