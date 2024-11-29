
import java.util.Scanner;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero del cual quiere su factorial");
        int numero= scanner.nextInt();
        
        int factorial = 1;
        int i = 1;
        while (i <=numero){
            factorial *= i;
            i++;
        }
        System.out.println("el factoeial de "+numero+" es "+factorial);
        
    }
}
