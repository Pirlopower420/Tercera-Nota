import java.util.Scanner;
public class IdentificadorDeNumerosPrimos {
    public static void main(String[] args) {
        System.out.print("ingrese un numero para saber si es primo");
        Scanner sc = new Scanner(System.in);
        int numPrimo = sc.nextInt(); 
        int contadordeDivisores1=0;
        for(int co=1 ; co<=numPrimo; co++){
            if(numPrimo % co ==0){
                 contadordeDivisores1++;
            }
        }
        if(contadordeDivisores1==2){
            System.out.println("el numero "+numPrimo+" es primo");
        } else {
            System.out.println("el numero "+numPrimo+" no es primo");
        }
        System.out.println("numeros primos de 1 hasta 100");
       for(int i=1 ; i<=100 ; i++){
             int contadordeDivisores=0;
          for( int j=1 ; j<=i ; j++){
               if(i % j == 0){
                  contadordeDivisores++;
               }
          }
          if(contadordeDivisores==2){
          System.out.println(i);
          }
      
       }
    }
}    
