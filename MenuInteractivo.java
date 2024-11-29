
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el ccodigo de las operacion que quiere");
        System.out.println("codigo / operacion");
        System.out.println(" 1     / suma");
        System.out.println(" 2     / resta");
        System.out.println(" 3     / multiplicacion");
        System.out.println(" 4     / division");
        int codigo = scanner.nextInt();
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        switch(codigo){
        case 1:
            int suma = numero1 + numero2;
            System.out.println("Suma: " + suma);
        break;
        
        case 2:
            int resta = numero1 - numero2;
            System.out.println("Resta: " + resta);
        break;
        
        case 3:
            int multiplicacion = numero1 * numero2;
            System.out.println("Multiplicación: " + multiplicacion);
        break;
        
        case 4:
            if(numero2 !=0){
                int division = numero1 / numero2;
                System.out.println("División: " + division);
            }else{
                System.out.println("error: division por cero");
            }
        break;
        
        default:
        System.out.println("codigo no valido");
        break;
        }
    }
}
