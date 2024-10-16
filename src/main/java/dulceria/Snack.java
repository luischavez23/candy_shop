package dulceria;

public class Snack extends Product {
    public Snack(String name, double price) {
        super(name, price);
    }

    @Override
    public String showDetails() {
        return getName() + " - $" + getPrice() + " MXN (Snack)";
    }
}
