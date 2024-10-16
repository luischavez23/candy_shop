package dulceria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart {
    private final Map<String, Product> products;

    public Cart() {
        products = new HashMap<>();
    }

    public void addProduct(String key, Product product) {
        products.put(key, product);
    }

    public void printComboSummary() {
        if (products.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Carrito:");
            products.forEach((key, product) -> System.out.println(key + ": " + product.showDetails()));
        }
    }

    public double calculateTotal() {
        return products.values().stream().mapToDouble(Product::getPrice).sum();
    }

    public void makeSell() {
        double total = calculateTotal();
        if (total == 0) {
            System.out.println("Agrega productos al carrito.");
            return;
        }

        System.out.println("Total a pagar: $" + total + " MXN");
        System.out.print("Monto pagado: ");
        double amountPaid = new Scanner(System.in).nextDouble();

        if (amountPaid >= total) {
            System.out.println("Venta procesada con éxito. Cambio: $" + (amountPaid - total) + " MXN");
            products.clear();
        } else {
            System.out.println("Monto insuficiente. Faltan $" + (total - amountPaid) + " MXN.");
        }
    }

    public void clearCart() {
        products.clear();
    }
}
