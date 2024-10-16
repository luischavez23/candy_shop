package dulceria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Popcorn extends Product {

    private final Map<Integer, String> flavors;
    private String chosenFlavor = "";
    private final Scanner sc;

    public Popcorn(String name, double price) {
        super(name, price);
        this.sc = new Scanner(System.in);
        this.flavors = new HashMap<>();
        flavors.put(1, "Mantequilla");
        flavors.put(2, "Caramelo");
        flavors.put(3, "Queso");
        flavors.put(4, "Takis");
    }

    public void selectFlavor() {
        System.out.println("------------ Sabores de Palomitas ------------");
        flavors.forEach((key, value) -> System.out.println(key + ". " + value));
        System.out.print("Selecciona una opción: ");
        int choice = sc.nextInt();
        chosenFlavor = flavors.getOrDefault(choice, "Mantequilla");
        System.out.println("Has seleccionado: " + chosenFlavor);
    }

    @Override
    public String showDetails() {
        return getName() + " - Sabor: " + chosenFlavor + " - $" + getPrice() + " MXN";
    }
}
