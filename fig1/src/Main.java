import amazon.Amazon;
import dropbox.Dropbox;

public class Main {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();
        amazon.createServer("us-east-1");
        amazon.listServers("us-east-1");
        amazon.getCDNAddress();
        amazon.storeFile("report.pdf");
        amazon.getFile("report.pdf");

        System.out.println("-----");

        Dropbox dropbox = new Dropbox();
        dropbox.storeFile("photo.png");
        dropbox.getFile("photo.png");
    }
}
