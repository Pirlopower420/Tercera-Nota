
public class FizzBuzz {
    public static void main(String[] args) {
      int multiplosde3=3;
      int multiplosde5=5;
      for (int i=1;i<=100; i++){
          if((i%3==0) & (i%5==0)){
              System.out.println("fizzbuzz");
          } else if(i % multiplosde5==0){
              System.out.println("buzz");
          } else if(i % multiplosde3==0){
              System.out.println("fizz");
          } else{
              System.out.println(+i);
          }
      }
    }
}    
