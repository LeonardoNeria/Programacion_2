package cuenta;

/**
 *
 * @author lexna
 */
public class CuentaBancaria {
    
    double saldo;
    
    void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }
    
    void retirar(double cantidad) {
        saldo = saldo - cantidad;
    }
    
    void mostrarSaldo(){
        System.out.println("Saldo: $" + saldo);
    }
}
