package nombres_for;
import java.util.*;
/**
 *
 * @author lexna
 */
public class Nombres_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer =  new Scanner(System.in);
        

        String[] nombres = new String[11];
        
        System.out.println("Ingresa el nombre del indice 0");
        nombres[0]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 1");
        nombres[1]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 2");
        nombres[2]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 3");
        nombres[3]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 4");
        nombres[4]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 5");
        nombres[5]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 6");
        nombres[6]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 7");
        nombres[7]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 8");
        nombres[8]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 9");
        nombres[9]=leer.nextLine();
        //leer.nextLine();
        
        System.out.println("Ingresa el nombre del indice 10");
        nombres[10]=leer.nextLine();
        //leer.nextLine();
        
        
        for (int x = 0; x < nombres.length; x++) {
            System.out.println(nombres[x]);
        }

}
}
