public class UnValorModificado {
    //paso por valor
    public static void main(String[] args) {
       int x = 10;
       System.out.println("Antes de llamar a incrementar: x =" +x);
       x=incrementar(x);
       System.out.println("Antes de llamar a incrementar: x = "+x);
    }
    public static int incrementar(int x){
        x++;
         System.out.println("Dentro de incrementar: x = "+x);
        return x;
    }
   
}