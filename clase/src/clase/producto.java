package clase;

/**
 *
 * @author lexna
 */
public class producto {
    

    // Atributos
    String nombre;
    double precio;
    int existencia;

    // Constructor
    public producto(String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    // Metodo
    public void mostrarInformacion() {
        System.out.println("Informacion del producto\nNombre: " + nombre + "\nPrecio: " + precio + "\nExistencia: " + existencia + "\n");
    }

    // Metodo
    public void vender(int cantidad) {
        if (cantidad <= existencia) {
            existencia = existencia - cantidad;
            System.out.println("Venta realizada. Nueva existencia: " + existencia);
        } else {
            System.out.println("No hay existencia suficiente");
        }
    }
    

}
