import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeNotas {
    private static final String ARCHIVO_NOTAS = "notas.txt";

    public static void main(String[] args) {
        List<String> notasGuardadas = new ArrayList<>();

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar nota");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Salir");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Para evitar el salto de línea extra

            switch (opcion) {
                case 1:
                    agregarNota(notasGuardadas, scanner);
                    break;
                case 2:
                    mostrarNotasOrdenadas(notasGuardadas);
                    break;
                case 3:
                    System.out.println("Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static void agregarNota(List<String> notasGuardadas, Scanner scanner) {
        System.out.print("Ingrese la nota: ");
        String nota = scanner.nextLine();
        
        try (FileWriter writer = new FileWriter(ARCHIVO_NOTAS, true)) {
            writer.write(nota + "\n");
            System.out.println("Nota agregada con éxito.");
            
            // Agregar la nota a la lista en orden de guardado
            notasGuardadas.add(nota);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    private static void mostrarNotasOrdenadas(List<String> notasGuardadas) {
        if (!notasGuardadas.isEmpty()) {
            System.out.println("\nNotas guardadas en orden de agregación:");
            for (int i = 0; i < notasGuardadas.size(); i++) {
                System.out.println((i + 1) + ". " + notasGuardadas.get(i));
            }
        } else {
            System.out.println("No hay notas guardadas.");
        }
    }
}
