package sistemasproductos;

/**
 *
 * @author lexna
 */
public class productos {
    int codigo;
    String nombre;
    double precio;
    
    public productos(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrar() {
        System.out.println("Codigo" + codigo + "|Nombre: " + nombre + "|Precio: $" + precio);
    }
}
