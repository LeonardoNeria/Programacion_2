/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivo_negativo;
import java.util.Scanner;

/**
 *
 * @author lexna
 */
public class Positivo_negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int numero = teclado.nextInt();
        
        if (numero >= 0) {
            
            System.out.println("Tu número es positivo");
        } 
        
        else 
        
        {
            
            System.out.println("Tu número es negativo");
        }
        
        
    }


    
}
