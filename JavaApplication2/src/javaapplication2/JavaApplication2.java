/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author lexna
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingresa apellido ");
        String apellido = teclado.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = teclado.nextInt();
        
        System.out.println("Hola " + nombre);
        System.out.println("Tienes " + edad + " años");
        
    
    }
    
}
