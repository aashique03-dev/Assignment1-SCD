import order.Order;
import shipping.*;
public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(8, new Ground());
        System.out.println("Ground Shipping Cost: " + order1.getTotalCost());
        System.out.println("Delivery Days: " + order1.getShippingDays());

        System.out.println("-----");

        Order order2 = new Order(8, new Air());
        System.out.println("Air Shipping Cost: " + order2.getTotalCost());
        System.out.println("Delivery Days: " + order2.getShippingDays());
    }
}