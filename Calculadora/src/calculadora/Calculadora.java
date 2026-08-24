/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;

/**
 *
 * @author leo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa 1 para sumar:\nIngresa 2 para restar:\nIngresa 3 para Multiplicar:\nIngresa 4 para Dividir:");
        int numero = teclado.nextInt();
                
        if (numero == 1) {
            System.out.println("Ingresa un numero: ");
            int var_x = teclado.nextInt();
            System.out.println("Ingresa un segundo numero: ");
            int var_y = teclado.nextInt();
            
            System.out.println(var_x + var_y);
            
        }
        
        else if (numero == 2) {
            System.out.println("Ingresa un numero: ");
            int var_x = teclado.nextInt();
            System.out.println("Ingresa un segundo numero: ");
            int var_y = teclado.nextInt();
            
            System.out.println(var_x - var_y);
        }
        
        else if (numero == 3) {
            System.out.println("Ingresa un numero: ");
            int var_x = teclado.nextInt();
            System.out.println("Ingresa un segundo numero: ");
            int var_y = teclado.nextInt();
            
            System.out.println(var_x * var_y);
        }
        
        else
        {
            System.out.println("Ingresa un numero: ");
            int var_x = teclado.nextInt();
            System.out.println("Ingresa un segundo numero: ");
            int var_y = teclado.nextInt();
            
            System.out.println(var_x / var_y);
        }
    }
    
}
