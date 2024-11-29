import java.util.Scanner;
public class MayorDeTresNumeros {
    public static void main(String[] args) {
        //Jhon Hamilton Gómez Molina 192436
     Scanner sc= new Scanner(System.in);
     System.out.println("Ingrese el primer numero");
     int numero1= sc.nextInt();
     System.out.println("Ingrese el segundo numero");
     int numero2= sc.nextInt();
     System.out.println("ingrese el tercer numero");
     int numero3= sc.nextInt();
     if ((numero1>numero2) && (numero1>numero3)){
         System.out.println("el numero mayor es: "+numero1);
     }else if((numero2>numero1) && (numero2>numero3)){
         System.out.println("el numero mayor es: "+numero2);
     }else{
         System.out.println("el numero mayor es: "+numero3);
     } 
     
    
    }
}
