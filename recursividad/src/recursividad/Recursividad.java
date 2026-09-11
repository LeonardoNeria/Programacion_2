package recursividad;
import java.util.*;
/**
 *
 * @author lexna
 */
public class Recursividad {
    
    
    public static int factorial(int n){
        //caso base
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        
        numero=leer.nextInt();
        
        System.out.println(factorial(numero));
        
        
        System.out.println("Hola");
        saludar();
    }
    
    public static void saludar() {
        System.out.println("Hola, que pex");
    }
    
   
}
