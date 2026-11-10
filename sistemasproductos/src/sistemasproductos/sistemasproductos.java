package sistemasproductos;

import java.util.ArrayList;

/**
 *
 * @author lexna
 */
public class sistemasproductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<productos> productos = new ArrayList<>();

        productos.add(new productos(101, "Teclado", 500.0));
        productos.add(new productos(102, "Mouse", 300.0));
        productos.add(new productos(103, "Monitor", 3500.0));
        productos.add(new productos(104, "Audifonos", 500.0));

        int codigoBuscar = 103;

        boolean encontrado = false;

        for (productos producto : productos) {
            System.out.println("Productos encontrado");
            productos.mostrar();

            encontrado = true;
            break;
        }
    }
    if(!encontrado){System.out.println("Producto no encontrado");
    }
  }
}
