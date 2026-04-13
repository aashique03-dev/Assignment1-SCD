package order;

import shipping.Shipping;

public class Order {
    private double weight;
    private Shipping shipping;

    public Order(double weight, Shipping shipping) {
        this.weight = weight;
        this.shipping = shipping;
    }

    public double getTotalCost() {
        return shipping.getCost(weight);
    }

    public int getShippingDays() {
        return shipping.getDeliveryDays();
    }
}