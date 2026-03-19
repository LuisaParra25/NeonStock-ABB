import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolInventario inventario = new ArbolInventario();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n=== TERMINAL DE INVENTARIO: CYBER-NODE ===");
            System.out.println("1. Registrar nuevo artículo");
            System.out.println("2. Mostrar inventario (Recorrido Inorden)");
            System.out.println("3. Buscar artículo por ID");
            System.out.println("0. Desconectar (Salir)");
            System.out.print("Ingrese un comando: ");
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el ID numérico del artículo: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del artículo: ");
                        String nombre = scanner.nextLine();
                        inventario.insertar(id, nombre);
                        System.out.println("Artículo registrado con éxito en la red.");
                        break;
                    case 2:
                        System.out.println("\n--- LISTADO DE ARTÍCULOS ---");
                        inventario.mostrarInorden();
                        break;
                    case 3:
                        System.out.print("Ingrese el ID a rastrear: ");
                        int buscaId = scanner.nextInt();
                        if (inventario.buscar(buscaId)) {
                            System.out.println(">>> Estado: ENCONTRADO. El artículo existe en la base de datos.");
                        } else {
                            System.out.println(">>> Estado: NO ENCONTRADO. Verifique el ID.");
                        }
                        break;
                    case 0:
                        System.out.println("Cerrando conexión con el inventario...");
                        break;
                    default:
                        System.out.println("Error: Comando no reconocido.");
                }
            } catch (Exception e) {
                System.out.println("Error crítico: Por favor, ingrese un número válido.");
                scanner.nextLine(); // Evitar bucle infinito si se ingresa texto
            }
        }
        scanner.close();
    }
}