package arreglos;
import java.util.Scanner;

/**
 *
 * @author lexna
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] calificaciones = {100,80,75,20};
        System.out.println(calificaciones[0]);
        System.out.println(calificaciones[3]);
        
        if (calificaciones[2]>=60){
            System.out.println("Superaste al Dylan");
        }else{
            System.out.println("pinche Dylan");
        }
        
        
        String[] productos = {"Shampoo", "Papel", "C4"};
        String[] productos_2 = {"Shampoo", "Papel", "C4", "Pasta Dental", "Sal", "Pimienta"};
        System.out.println(productos[1]);
        System.out.println(productos[0]);
        System.out.println("\n");
        
        for(int x=0;x<3;x++){
            System.out.println(productos[x]);
    }
        
        System.out.println("\n");
        
        // segunda forma
        for (int x=0; x < productos_2.length; x++) {
            System.out.println(productos_2[x]);
        }
        
        System.out.println("\n");
        // Tercera forma
        for (String producto: productos) {
            System.out.println(producto);
        }
        
        
        
    }
    
}
