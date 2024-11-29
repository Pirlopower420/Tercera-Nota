import java.util.Scanner;
public class OperadoresDeComparacionYLogicos {
    public static void main(String[] args) {
        //Jhon Hamilton Gómez Molina 192436
     Scanner sc= new Scanner(System.in);
     System.out.println("Ingrese el primer numero");
     int numero1= sc.nextInt();
     System.out.println("Ingrese el segundo numero");
     int numero2= sc.nextInt();
     System.out.println("ingrese el tercer numero");
     int numero3= sc.nextInt();
    boolean resultado =(numero1>numero2) && (numero1<numero3);
     System.out.println("¿El primer número es mayor que el segundo y menor que el tercero? " + resultado);
    }
}
