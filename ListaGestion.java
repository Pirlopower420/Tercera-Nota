import java.util.ArrayList;
import java.util.List;

public class ListaGestion {
    private List<String> listaElementos;

    public ListaGestion() {
        this.listaElementos = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        listaElementos.add(elemento);
    }

    public String obtenerElemento(int indice) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= listaElementos.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        return listaElementos.get(indice);
    }

    public int contarElementos() {
        return listaElementos.size();
    }

    public static void main(String[] args) {
        ListaGestion lista = new ListaGestion();

        try {
            lista.agregarElemento("Elemento 1");
            lista.agregarElemento("Elemento 2");
            lista.agregarElemento("Elemento 3");

            System.out.println("Contador de elementos: " + lista.contarElementos());

            System.out.println("Primer elemento: " + lista.obtenerElemento(0));
            System.out.println("Segundo elemento: " + lista.obtenerElemento(1));
            System.out.println("Tercer elemento: " + lista.obtenerElemento(2));

            // Intentando acceder fuera del rango
            lista.obtenerElemento(5); // Esto lanzará una IndexOutOfBoundsException

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Todas las operaciones han terminado.");
    }
}

