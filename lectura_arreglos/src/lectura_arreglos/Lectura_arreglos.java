package lectura_arreglos;
import java.util.*;
/**
 *
 * @author lexna
 */
public class Lectura_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // new es para conjunto vacio
        
        int[] numeros = new int[3];
        
        System.out.println("Ingresa el numero del indice 0");
        numeros[0]=leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingresa el numero del indice 1");
        numeros[1]=leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingresa el numero del indice 2");
        numeros[2]=leer.nextInt();
        leer.nextLine();
        
        System.out.println("Numero en el indice 0: " + numeros[0]);
        System.out.println("Numero en el indice 1: " + numeros[1]);
        System.out.println("Numero en el indice 2: " + numeros[2]);
    }
    
}
