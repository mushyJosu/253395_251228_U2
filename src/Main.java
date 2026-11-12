import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlTutor tutor = new ControlTutor(); //se llama a la función defina
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(scanner, "Elige una opcion: ");

            switch (opcion) {
                case 1:
                    tutor.mostrarTodos();
                    break;
                case 2:
                    tutor.mostrarPorEstatus("inscrito");//2
                    break;
                case 3:
                    tutor.mostrarPorEstatus("inactivo");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Escribe un valor correcto (del 1 al 4).");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu Control Alumnos Tutorados");
        System.out.println("1. Ver alumnos tutorados");
        System.out.println("2. Ver estatus inscritos");
        System.out.println("3. Ver estatus inactivos");
        System.out.println("4. Salir del programa");
    }

    // Repite la pregunta hasta que se escriba un numero entero
    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = scanner.nextLine().trim();
            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                System.out.println("Escribe un valor correcto.");
            }
        }
    }
}