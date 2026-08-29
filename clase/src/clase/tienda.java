package clase;

/**
 *
 * @author lexna
 */
public class tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear objeto
        producto producto1 = new producto("Teclado", 1550.50, 2);
        producto producto2 = new producto("Monitor", 3800, 3);
        producto producto3 = new producto("Bocinas", 900, 5);
        
        // Usar los metodos de los objetos
        producto1.mostrarInformacion();
        producto1.vender(3);
        
        producto2.mostrarInformacion();
        producto2.vender(3);
        
        producto3.mostrarInformacion();
        producto3.vender(4);
    }
    
}
