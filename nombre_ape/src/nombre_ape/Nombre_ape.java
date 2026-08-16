package nombre_ape;
import java.util.Scanner;

/**
 *
 * @author lexna
 */
public class Nombre_ape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
       
        
        System.out.println("Ingresa 1 para nombre o Ingresa 2 para el apellido: ");
        int numero = teclado.nextInt();
        
        if (numero == 1) 
        {
            
            System.out.println("Ingresa tu nombre: ");
            String nombre = teclado.next();
            System.out.println("Tu nombre es: " + nombre);
           
            
        }
        
        else if (numero == 2)
        {
            System.out.println("Ingresa tu apellido: ");
            String apellido = teclado.next();
            System.out.println("Tu apellido es: " + apellido);
            
        }
    }
    
}
