
public class TiendaDeRopa {
    public static void main(String[] args) {
        //Jhon Hamilton Gómez Molina 192436
        final double DESCUENTO = 0.15;
        final double DESCUENTO_ADICIONAL=0.05;
        double precioCamiseta = 25;
        double precioPantalon = 30;
        double precioCamisetaDescuento = precioCamiseta-(precioCamiseta*DESCUENTO);
        double precioPantalonDescuento = precioPantalon-(precioPantalon*DESCUENTO);
         double resultado= precioCamisetaDescuento + precioPantalonDescuento;
        double segundaCamiseta= precioCamisetaDescuento-(precioCamisetaDescuento * DESCUENTO_ADICIONAL);
        System.out.println("precio de camiseta con descuento= "+ precioCamisetaDescuento);
        System.out.println("precio de pantalon con descuento= "+ precioPantalonDescuento);
        System.out.println("Precio total de la camiseta y el pantalón, sin segunda camiseta= "+ resultado);
        System.out.println("precio de la segunda camiseta= "+ segundaCamiseta);
    }
}
