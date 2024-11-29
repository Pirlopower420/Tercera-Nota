class Persona {
    String nombre;
}

public class ReasignacionDeReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Jhon";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre); // Imprime Jhon
    }

    public static void cambiarPersona(Persona persona) {
        persona = new Persona();  // Creamos un nuevo objeto
        persona.nombre = "Hamilton";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre);  // Imprime Hamilton
    }
}