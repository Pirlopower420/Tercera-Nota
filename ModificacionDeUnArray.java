public class ModificacionDeUnArray {
    //paso por referencia
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Antes de llamar a modificarArray: " + java.util.Arrays.toString(numeros));
        modificarArray(numeros);
        System.out.println("Después de llamar a modificarArray: " + java.util.Arrays.toString(numeros));
    }
     public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Dentro de modificarArray: " + java.util.Arrays.toString(arr));
    }
}
