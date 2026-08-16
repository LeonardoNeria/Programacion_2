/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;
import javax.swing.*;

/**
 *
 * @author leo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        String nombre;
        int edad=33;
        float flotante=3.1415f;
        boolean decision=false;
        
        System.out.println(edad);
        System.out.println(flotante);
        
        nombre=JOptionPane.showInputDialog("Cual es tu nombre?");
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Flotante " + flotante);
        
        

        
        
  
    }
    
}
