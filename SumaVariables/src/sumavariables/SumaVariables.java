/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumavariables;
import java.util.Scanner;

/**
 *
 * @author lexna
 */
public class SumaVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int var_x = teclado.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int var_y = teclado.nextInt();
        
        System.out.println(var_x + var_y);
           
        
    }
    
}
