import java.util.Scanner;
public class EntradaYSalida {
    public static void main(String[] args) {
        //Jhon Hamilton Gómez Molina 192436
     Scanner sc= new Scanner(System.in);
     System.out.println("Ingrese su nombre");
     String nombre= sc.nextLine();
     System.out.println("Ingrese su edad");
     int edad= sc.nextInt();
     System.out.println("ingrese su altura");
     double altura= sc.nextDouble();
     System.out.println("hola "+nombre+" tienes "+edad+" años y mides "+altura+" metros");
    }
}
