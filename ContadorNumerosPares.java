
public class ContadorNumerosPares {
    public static void main(String[] args) {
        //Jhon Hamilton Gómez Molina 192436
     int numerosPares=0;
     for(int i=1; i<=100; i++){
         if(i % 2==0){
             numerosPares++;
         }
     }
    System.out.println("hay "+numerosPares+" numeros pares de 1 a 100");
    
    }
}
