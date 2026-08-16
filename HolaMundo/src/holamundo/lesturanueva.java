package holamundo;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class lesturanueva{
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingresa apellido ");
        String apellido = teclado.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("Hola " + nombre);
        System.out.println("Tienes " + edad + " años");
        
    
}
