package cuenta;
import java.util.*;
/**
 *
 * @author lexna
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double morlacos, resta;
        CuentaBancaria cuenta = new CuentaBancaria();
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Dame morlacos");
        morlacos = lectura.nextDouble();
        cuenta.depositar(morlacos);
        
        System.out.println("Morlacos a retirar");
        resta = lectura.nextDouble();
        cuenta.retirar(resta);
        
        
        cuenta.depositar(morlacos);
        
        cuenta.mostrarSaldo();
        
        
    }
    
}
