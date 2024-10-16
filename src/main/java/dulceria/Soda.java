package dulceria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soda extends Product {

    private final Map<Integer, String> flavors;
    private String chosenFlavor = "";
    private final Scanner sc;

    public Soda(String name, double price) {
        super(name, price);
        this.sc = new Scanner(System.in);
        this.flavors = new HashMap<>();
        flavors.put(1, "Coca-Cola");
        flavors.put(2, "Manzanita");
        flavors.put(3, "Fanta");
        flavors.put(4, "Sprite");
        flavors.put(5, "Nestea");
    }

    public void selectFlavor() {
        System.out.println("------------ Sabor de la Soda ------------");
        flavors.forEach((key, value) -> System.out.println(key + ". " + value));
        System.out.print("Selecciona una opción: ");
        int choice = sc.nextInt();
        chosenFlavor = flavors.getOrDefault(choice, "Coca-Cola");
        System.out.println("Has seleccionado: " + chosenFlavor);
    }

    @Override
    public String showDetails() {
        return getName() + " - Sabor: " + chosenFlavor + " - $" + getPrice() + " MXN";
    }
}
