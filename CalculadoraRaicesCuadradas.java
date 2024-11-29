import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class CalculadoraRaicesCuadradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        
        try {
            double numero = scanner.nextDouble();
            
            if (numero < 0) {
                throw new NumeroNegativoException("El número no es válido. Debe ingresar un número positivo.");
            }
            
            double raízCuadrada = Math.sqrt(numero);
            System.out.printf("La raíz cuadrada de %.2f es %.2f%n", numero, raízCuadrada);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
