package poo;

/**
 *
 * @author lexna
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objeto
        persona persona1 = new persona("Dylan", 20);
        persona persona2 = new persona("Panchito", 22);
        
        // Usar los métodos de los objetos
        persona1.saludar();
        persona1.mostrarEdad();
        
        persona2.saludar();
        persona2.mostrarEdad();
        
        
    }
    
}
