public class Anagrama {
    //
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Convertir ambas palabras a minúsculas y eliminar espacios
        palabra1 = palabra1.replaceAll("\\s+", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s+", "").toLowerCase();
        // Verificar si tienen la misma longitud
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        // Contar los caracteres de cada palabra
        int[] conteo = new int[256];
        // Contar caracteres en palabra1
        for (char c : palabra1.toCharArray()) {
            conteo[c]++;
        }
        // Restar contadores en palabra2
        for (char c : palabra2.toCharArray()) {
            conteo[c]--;
        }
        // Si todos los contadores son 0, son anagramas
        for (int i = 0; i < 256; i++) {
            if (conteo[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String palabra1 = "AMOR";
        String palabra2 = "ROMA";
        System.out.println(palabra1 + " y " + palabra2 + " son anagramas: " + sonAnagramas(palabra1, palabra2));
    }
}
