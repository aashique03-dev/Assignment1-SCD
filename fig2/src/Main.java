import engine.ElectricEngine;
import engine.CombustionEngine;
import driver.Human;
import driver.Robot;
import transport.Transport;

public class Main {
    public static void main(String[] args) {

        // Example 1
        Transport t1 = new Transport(new ElectricEngine(), new Robot());
        t1.deliver("Karachi", "Food Package");

        System.out.println("-----");

        // Example 2
        Transport t2 = new Transport(new CombustionEngine(), new Human());
        t2.deliver("Lahore", "Electronics");
    }
}