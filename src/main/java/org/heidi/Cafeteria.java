package org.heidi;

import java.util.Scanner;

public class CafeteriaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;

        // Ciclo while para repetición del menú hasta que el usuario elija la opción 2 (Salir)
        while (opcionMenu != 2) {
            System.out.println("================================");
            System.out.println("        CAFETERÍA ESCOLAR       ");
            System.out.println("================================");
            System.out.println("1. Registrar compra");
            System.out.println("2. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcionMenu = scanner.nextInt();
            scanner.nextLine(); // Limpiar el búfer del scanner

            // Uso obligatorio de la estructura switch para las opciones del menú
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n================================");
                    System.out.println("        REGISTRAR COMPRA        ");
                    System.out.println("================================");

                    // 1. Nombre del cliente
                    System.out.print("Nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();

                    // 2. Número de productos diferentes que comprará
                    System.out.print("¿Cuántos productos comprará?: ");
                    int numProductos = scanner.nextInt();

                    // Acumulador para el subtotal de la compra
                    double subtotal = 0.0;

                    // Uso obligatorio de un ciclo for para capturar cada producto
                    for (int i = 1; i <= numProductos; i++) {
                        System.out.println("Producto " + i);

                        // 3. Precio del producto
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();

                        // 4. Cantidad de unidades
                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();

                        // Cálculo del importe por producto acumulando al subtotal
                        double importe = precio * cantidad;
                        subtotal += importe;

                        System.out.printf("Importe: $%.2f%n", importe);
                        System.out.println();
                    }

                    // Cálculo de descuento usando estructuras condicionales (if, else if, else)
                    double porcentajeDescuento = 0.0;

                    if (subtotal < 100) {
                        porcentajeDescuento = 0.0;
                    } else if (subtotal >= 100 && subtotal < 300) {
                        porcentajeDescuento = 0.05; // 5%
                    } else {
                        porcentajeDescuento = 0.10; // 10%
                    }

                    double descuento = subtotal * porcentajeDescuento;
                    double total = subtotal - descuento;

                    // Impresión del Resumen de la Compra
                    System.out.println("================================");
                    System.out.println("        RESUMEN DE COMPRA       ");
                    System.out.println("================================");
                    System.out.println("Cliente: " + nombreCliente);
                    System.out.printf("Subtotal: $%.2f%n", subtotal);
                    System.out.printf("Descuento: $%.2f%n", descuento);
                    System.out.printf("Total: $%.2f%n", total);
                    System.out.println("================================");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("¡Gracias por utilizar el sistema de la Cafetería Escolar!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.\n");
                    break;
            }
        }

        scanner.close();
    }
}
