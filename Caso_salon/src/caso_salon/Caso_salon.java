/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_salon;
import java.util.Scanner;

/**
 *
 * @author lexna
 */
public class Caso_salon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un nombre: ");
        String caracter = teclado.nextLine();
        
        
        
        
        
        switch (caracter) {
            case "Leo":
                System.out.println("Elegiste un estudiante");
                break;
                
            case "Juan":
                System.out.println("Elegiste un estudiante");
                break;
                
            case "Jorge":
                System.out.println("Elegiste un estudiante");
                break;
                
            case "Moises":
                System.out.println("Elegiste al maestro");
                break;
                
            default:
                System.out.println("Elegiste otra opcion");
        
        }
    }
    
}
