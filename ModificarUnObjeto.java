class Rectangulo {
    int ancho;
    int alto;

    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class ModificarUnObjeto {
//paso por referencia
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 90;
        r.alto = 80;
        System.out.println("Dentro del método: ancho = " + r.ancho + " y alto = " + r.alto);
    }

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(69, 66);
        System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + " y alto = " + miRectangulo.alto);
        modificarRectangulo(miRectangulo);
        System.out.println("Después de modificar: ancho = " + miRectangulo.ancho + " y alto = " + miRectangulo.alto);
    }
}
