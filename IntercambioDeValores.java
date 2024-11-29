
public class IntercambioDeValores {
  //(paso por valor)
    public static void main(String[] args) {
       int a=11;
       int b=10;
       System.out.println("Antes de llamar a interCambiarValor: a = "+a+" y b = "+b);
      interCambiarValor(a,b);
      System.out.println("Despues de llamar a interCambiarValor: a = "+a+" y b = "+b);
    }
      public static void interCambiarValor(int a, int b){
          int cambio=a;
          a=b;
          b=cambio;
          System.out.println("Dentro de interCambiarValor: a = "+a+" y b = "+b);
    }
}