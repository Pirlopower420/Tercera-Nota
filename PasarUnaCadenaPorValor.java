public class PasarUnaCadenaPorValor {
    public static void main(String[] args) {
     String primerTexto = "hola";
     System.out.println("antes de llamar a modificarCadena: "+primerTexto);
     modificarCadena(primerTexto);
     System.out.println("despues de llamar a modificarCadena: "+primerTexto);
    }
    public static void modificarCadena(String segundoTexto){
        segundoTexto = segundoTexto + ", ¿como estas?";
        System.out.println("dentro de modificarCadena: "+segundoTexto);
    }
}
