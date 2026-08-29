package poo;

/**
 *
 * @author lexna
 */
public class persona {

    // Atributos
    String nombre;
    int edad;
    
    // Constructor
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Metodo
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
    
    // Metodo
    public void mostrarEdad() {
        System.out.println("Tengo " + edad + " años");
    }
}
