import java.util.Scanner;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("operadores aritmeticos basicos");
       System.out.println("ingrese el primer numero");
       int numero1= sc.nextInt();
       System.out.println("ingrese el segundo numero");
       int numero2= sc.nextInt();
       //suma
       int suma= numero1+numero2;
       //resta
       int resta=numero1-numero2;
       //multiplicacion
       int multiplicacion=numero1*numero2;
       //division
       double division= (double) numero1 / numero2;
       //modulo
       int modulo=numero1%numero2;
       
       System.out.println("suma: "+suma);
       System.out.println("resta: "+resta);
       System.out.println("multiplicacion: "+multiplicacion);
       System.out.println("division: "+division);
       System.out.println("modulo: "+modulo);
       
       
       
    }
}    