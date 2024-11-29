
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero del cual quiere su tabla de multiplicar");
        int numero= scanner.nextInt();
        
        for(int i=1 ; i<=10 ; i++){
            int tablaDeMultiplicar= numero*i;
            System.out.println(+numero+"x"+i+"="+tablaDeMultiplicar);
            
        }
        
   
        
    }
}
