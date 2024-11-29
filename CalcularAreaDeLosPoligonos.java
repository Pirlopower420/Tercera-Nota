
import java.util.Scanner;

public class CalcularAreaDeLosPoligonos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area de un poligono");
        System.out.println(" codigo // poligono");
        System.out.println(" 1      // Area del triangulo");
        System.out.println(" 2      // Area del cuadrado");
        System.out.println(" 3      // Area del rectangulo");
        System.out.println("Ingrese el codigo del poligono que quiere conocer su area");
        int codigo = sc.nextInt();
        switch(codigo){
            case 1: 
                System.out.println("Vamos a calcular el area del triangulo");
                System.out.println("Ingrese la base");
                double basedelTriangulo = sc.nextDouble();
                System.out.println("ingrese la altura");
                double alturadelTriangulo = sc.nextDouble();
                double areaTriangulo = (basedelTriangulo*alturadelTriangulo)/2;
                System.out.println("el area del triangulo es de "+areaTriangulo+" metros cuadrados");
                break ;
            case 2:   
                 System.out.println("Vamos a calcular el area del cuadrado");
                System.out.println("Ingrese el lado ");
                double lado = sc.nextDouble();
                 double areaCudrado= lado*2;
                System.out.println("el area del cuadrado es de "+areaCudrado+" metros cuadrados");
                break ;
            case 3: 
                 System.out.println("Vamos a calcular el area del rectangulo");
                System.out.println("Ingrese la base");
                double base = sc.nextDouble();
                System.out.println("ingrese la altura");
                double altura = sc.nextDouble();
                double areaRectangulo = base * altura;
                System.out.println("el area del rectangulo es de "+areaRectangulo+" metros cuadrados");
                break ;
            default :
             System.out.println("codigo de poligono no existente");
             break ;
        }
    }
    
}
