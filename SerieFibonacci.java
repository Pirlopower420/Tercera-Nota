
public class SerieFibonacci {
    public static void main(String[] args) {
        //se declaran los dos primeros numeros de la serie de fibonacci
        long numero1=0;
        long numero2=1;
        //se imprimen los dos primeros numeros de fibonacci
        System.out.println(numero1);
        System.out.println(numero2);
        //el ciclo que va recorrer los siguientes 48 numeros de fibonacci 
     for( int i=3; i<=50 ; i++){
        long suma=numero1+numero2; //se calcula el siguiente numero 
         System.out.println(suma); //se imprime el numero
         numero1=numero2; //el primer numero se actualiza con el valor del numero 2
         numero2=suma; //el segundo numero se actualiza con el valor de la suma
     }
    }
}    
