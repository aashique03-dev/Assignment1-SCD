package shipping;

public class Ground implements Shipping {

    @Override
    public double getCost(double weight) {
        double cost = weight * 1.5;
        return Math.max(cost, 10); // minimum $10
    }

    @Override
    public int getDeliveryDays() {
        return 5;
    }
}