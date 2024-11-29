
import java.util.Scanner;

public class PromedioDe5Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
      int[] numeros = new int[5];
      int suma = 0;
      
      for(int i = 0; i<numeros.length; i++){
          System.out.println("ingrese un numero");
          numeros[i]=scanner.nextInt();
          suma+=numeros[i];
      }
      double promedio = suma / (double) numeros.length;
      System.out.println("el promedio es: "+promedio);
    }
}
