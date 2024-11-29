
public class NumerosPrimos {
    public static void main(String[] args) {
       
        System.out.println("numeros primos de 1 hasta 100");
       for(int i=1 ; i<=100 ; i++){
             int esPrimo=0;
          for( int j=1 ; j<=i ; j++){
               if(i % j == 0){
                 esPrimo++;
               }
          }
          if(esPrimo==2){
          System.out.println(i);
          }
      
       }
    }
}    
