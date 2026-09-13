package ciclo_for_nombres;
import java.util.*;

public class Ciclo_for_nombres {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[] nombres = new String[10];
        for(int i = 0; i<10; i++) {
            nombres[i] = lectura.nextLine();
        }
        for(int x = 0; x<10; x++){
            System.out.println(nombres[x]);
        }
    }
}