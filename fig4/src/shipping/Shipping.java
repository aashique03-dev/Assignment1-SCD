package shipping;

public interface Shipping {
    double getCost(double weight);
    int getDeliveryDays();
}