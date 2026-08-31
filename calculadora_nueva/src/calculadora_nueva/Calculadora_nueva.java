package calculadora_nueva;
import java.util.*;

/**
 *
 * @author lexna
 */
public class Calculadora_nueva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        
        operaciones operacion = new operaciones();
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Dame el primer numero: ");
        num1 = lectura.nextInt();
        
        System.out.println("Dame el segundo numero: ");
        num2 = lectura.nextInt();
        
        operacion.sumar(num1, num2);
        operacion.restar(num1, num2);
        operacion.dividir(num1, num2);
        operacion.multiplicar(num1, num2);
    }
    
}
