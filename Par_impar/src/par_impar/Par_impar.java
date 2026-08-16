/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_impar;
import java.util.Scanner;

/**
 *
 * @author lexna
 */
public class Par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int numero = teclado.nextInt();
        
        if (numero == 1 || numero == 2 || numero == 4) {
            
            System.out.println("Numero par");
        }
        
        else
        {
            System.out.println("Numero impar");
        }
        
        
    }
    
}
