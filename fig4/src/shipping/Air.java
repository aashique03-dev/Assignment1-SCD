package shipping;

public class Air implements Shipping {

    @Override
    public double getCost(double weight) {
        return weight * 3; // faster but expensive
    }

    @Override
    public int getDeliveryDays() {
        return 2;
    }
}