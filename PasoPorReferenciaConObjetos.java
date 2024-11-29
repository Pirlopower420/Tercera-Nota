class Persona {
    String nombre;
}

public class PasoPorReferenciaConObjetos {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Jhon";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre); // Imprime Hamilton
    }

    public static void cambiarPersona(Persona persona) {
        persona.nombre = "Hamilton";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre);  // Imprime Hamilton
    }
}