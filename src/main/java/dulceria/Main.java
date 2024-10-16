package dulceria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        try {
            do {
                showMenu();
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Has seleccionado Combo Cuates");
                        agregarProductoConSabor(cart, "Palomitas", new Popcorn("Palomitas", 76.00));
                        agregarProductoConSabor(cart, "Refresco 1", new Soda("Refresco 1", 66.00));
                        agregarProductoConSabor(cart, "Refresco 2", new Soda("Refresco 2", 66.00));
                        break;

                    case 2:
                        System.out.println("Has seleccionado Combo Nachos");
                        agregarProductoConSabor(cart, "Palomitas", new Popcorn("Palomitas", 76.00));
                        agregarProductoConSabor(cart, "Refresco", new Soda("Refresco", 66.00));
                        cart.addProduct("Nachos", new Snack("Nachos", 70.00));
                        break;

                    case 3:
                        cart.printComboSummary();
                        break;

                    case 4:
                        cart.makeSell();
                        break;

                    case 5:
                        System.out.println("¡Gracias por su compra!");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } while (option != 5);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
            sc.nextLine();
        } finally {
            sc.close();
        }
    }

    private static void agregarProductoConSabor(Cart cart, String key, Product product) {
        if (product instanceof Popcorn) {
            ((Popcorn) product).selectFlavor();
        } else if (product instanceof Soda) {
            ((Soda) product).selectFlavor();
        }
        cart.addProduct(key, product);
    }

    public static void showMenu() {
        System.out.println("------------ Menú ------------");
        System.out.println("1. Combo Cuates");
        System.out.println("2. Combo Nachos");
        System.out.println("3. Ver carrito");
        System.out.println("4. Proceder venta");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
